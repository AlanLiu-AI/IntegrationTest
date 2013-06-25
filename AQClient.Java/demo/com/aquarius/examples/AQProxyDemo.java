package com.aquarius.examples;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.namespace.QName;

public class AQProxyDemo {
	
	private String AqHost;
	private String AcquisitionServiceUrl;
	private String PublishServiceUrl;
	private String AqUser;
	private String AqPassword;
	
	public AQProxyDemo(String host, String user, String password)
	{
		AqHost = host;
		AqUser = user;
		AqPassword = password;
		AcquisitionServiceUrl = "http://"+AqHost+"/AQUARIUS/AQAcquisitionService.svc";
		PublishServiceUrl = "http://"+AqHost+"/AQUARIUS/Publish/AquariusPublishService.svc";
	}
	
	public void AccessAcquisitionService()
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("AccessAcquisitionService started... ");
		try
		{
			String serviceURL = AcquisitionServiceUrl;
			com.aquarius.DataAcquisition.AQAcquisitionService aqAcquisitionservice = 
					new com.aquarius.DataAcquisition.AQAcquisitionService(new URL(serviceURL), new QName("http://tempuri.org/", "AQAcquisitionService"));
			com.aquarius.DataAcquisition.IAQAcquisitionService clientProxy = aqAcquisitionservice.getWSHttpBindingIAQAcquisitionService();
			javax.xml.ws.BindingProvider basicBindingProvider = (javax.xml.ws.BindingProvider) clientProxy;
			basicBindingProvider.getRequestContext().put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceURL);
			
			String authToken = clientProxy.getAuthToken(AqUser,  AqPassword);
			System.out.println("AuthToken is: " + authToken);
			
			com.sun.xml.ws.developer.WSBindingProvider wsBindingProvider = (com.sun.xml.ws.developer.WSBindingProvider) clientProxy;
			wsBindingProvider.setOutboundHeaders(
					com.sun.xml.ws.api.message.Headers.create(new QName("AQAuthToken"), authToken)
			);
			
			Boolean isSessionValid = clientProxy.isConnectionValid();
			if(!isSessionValid)
			{
				System.err.println("Session is invalid!");
			}
			
			com.aquarius.DataAcquisition.ArrayOfLocationDTO allLocations = clientProxy.getAllLocations();
			System.out.println("There are total " + allLocations.getLocationDTO().size() + " Locations: ");
			Iterator<com.aquarius.DataAcquisition.LocationDTO> iter = allLocations.getLocationDTO().iterator();
			
			int printIndex = 0;
			while(iter.hasNext()) {
				com.aquarius.DataAcquisition.LocationDTO location = iter.next(); 
				System.out.println("\t" + location.getIdentifier());
				printIndex++;
				if(printIndex>10)
				{
					System.out.println("\t.....");
					break;
				}
			}
			
			Boolean expectSessionAlive = clientProxy.keepConnectionAlive();
			if(!expectSessionAlive)
			{
				System.err.println("keepSessionAlive failed!");
			}
			
			long locationId = clientProxy.getLocationId("072632995"); //A location at 10.10.222.100
			if(locationId<1) locationId = clientProxy.getLocationId("AQTest");
			ArrayList<String> tsIdentifierList = new ArrayList<String>();
			ArrayList<String> parameterCodeList = new ArrayList<String>();
			if(locationId>0)
			{
				com.aquarius.DataAcquisition.ArrayOfTimeSeriesDescription tsArray = clientProxy.getTimeSeriesList(locationId, null);
				for(com.aquarius.DataAcquisition.TimeSeriesDescription tsDesc : tsArray.getTimeSeriesDescription())
				{
					tsIdentifierList.add(tsDesc.getIdentifier().getValue());
					parameterCodeList.add(tsDesc.getParameterType().getValue());
					String testStr = tsDesc.getParameterType().getValue()+"."+
							tsDesc.getUnits().getValue()+"."+
							tsDesc.getLabel();
					System.out.println(testStr);
							
				}
			}
			
			wsBindingProvider.close();//Avoid resource leaking
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void AccessPublishService()
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("AccessPublishService started... ");
		try
		{
			String serviceURL = PublishServiceUrl;
			com.aquarius.Publish.AquariusPublishService aqPublishService = 
					new com.aquarius.Publish.AquariusPublishService(new URL(serviceURL), new QName("http://tempuri.org/", "AquariusPublishService"));
			com.aquarius.Publish.IAquariusPublishService clientProxy = aqPublishService.getBasicHttpBindingIAquariusPublishService();
			javax.xml.ws.BindingProvider basicBindingProvider = (javax.xml.ws.BindingProvider) clientProxy;
			basicBindingProvider.getRequestContext().put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceURL);
			
			String authToken = clientProxy.getAuthToken(AqUser,  AqPassword);
			System.out.println("AuthToken is: " + authToken);
			
			//Pass token into clietProxy for other web services
			com.sun.xml.ws.developer.WSBindingProvider wsBindingProvider = (com.sun.xml.ws.developer.WSBindingProvider) clientProxy;
			wsBindingProvider.setOutboundHeaders(
					com.sun.xml.ws.api.message.Headers.create(new QName("AQAuthToken"), authToken)
			);
			
			Boolean isSessionValid = clientProxy.isConnectionValid();
			if(!isSessionValid)
			{
				System.err.println("Session is invalid!");
			}
			
			String parametersCsv = clientProxy.getParameterList();
			System.out.println("Parameters are: ");
			System.out.println(parametersCsv);
			
			
			Boolean expectSessionAlive = clientProxy.keepConnectionAlive();
			if(!expectSessionAlive)
			{
				System.err.println("keepSessionAlive failed!");
			}
			
			String filter = "identifier=072632995";
			String allLocations = clientProxy.getLocations(filter);
			System.out.println("All locations are: ");
			System.out.println(allLocations);
			
			wsBindingProvider.close();//Avoid resource leaking
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AQProxyDemo demo = new AQProxyDemo("aq-demo-server", "admin", "admin");
		demo.AccessAcquisitionService();
		demo.AccessPublishService();
	}
}
