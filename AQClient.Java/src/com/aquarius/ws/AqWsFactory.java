package com.aquarius.ws;

import java.net.URL;
import javax.xml.namespace.QName;

import com.aquarius.DataAcquisition.AQAcquisitionService;
import com.aquarius.DataAcquisition.IAQAcquisitionService;
import com.aquarius.Publish.AquariusPublishService;
import com.aquarius.Publish.IAquariusPublishService;
import com.sun.xml.ws.developer.WSBindingProvider;

public final class AqWsFactory {
	
	/*private static AqWsFactory singletonInstance = new AqWsFactory();
	
	private AqWsFactory() {}
	
	public static AqWsFactory getInstance()
	{
		if (singletonInstance == null) {
			singletonInstance = new AqWsFactory();
		}
		return singletonInstance;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}*/
	
	private static boolean isNullOrEmpty(String str)
	{
		return str == null || str.length() < 1;  
	}
	
	public static IAQAcquisitionService newAqAcqClient(String url) throws Exception
	{
		return newAqAcqClient(url, url, null, null, false);
	}
	
	public static IAQAcquisitionService newAqAcqClient(String url, String user, String pwd) throws Exception 
	{
		return newAqAcqClient(url, url, user, pwd, false);
	}
	
	public static IAQAcquisitionService newAqAcqBasicClient(String wsdl, String url) throws Exception
	{
		return newAqAcqClient(wsdl, url, null, null, true);
	}
	
	public static IAQAcquisitionService newAqAcqBasicClient(String wsdl, String url, String user, String pwd) throws Exception
	{
		return newAqAcqClient(wsdl, url, user, pwd, false);
	}
	
	@SuppressWarnings("resource")
	private static IAQAcquisitionService newAqAcqClient(String wsdl, String url, String user, String pwd, boolean basic) throws Exception {
		
		AQAcquisitionService clientFactory = new AQAcquisitionService(new URL(wsdl), new QName("http://tempuri.org/", "AQAcquisitionService"));
		IAQAcquisitionService client = basic ? clientFactory.getBasicHttpBindingIAQAcquisitionService()
				: clientFactory.getWSHttpBindingIAQAcquisitionService();
		javax.xml.ws.BindingProvider bindingProvider = (javax.xml.ws.BindingProvider) client;
		bindingProvider.getRequestContext().put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		
		if(!isNullOrEmpty(user) && !isNullOrEmpty(pwd))
		{
			String authToken = client.getAuthToken(user,  pwd);
			
			WSBindingProvider wsBindingProvider = (WSBindingProvider) client;
			wsBindingProvider.setOutboundHeaders(
				com.sun.xml.ws.api.message.Headers.create(new QName("AQAuthToken"), authToken)
				);
		}
		return client;
	}
		
	public static void close(IAQAcquisitionService client) throws Exception { 
		WSBindingProvider wsBindingProvider = (WSBindingProvider) client;
		wsBindingProvider.close();//Avoid resource leaking
	}
	
	public static void close(IAquariusPublishService client) throws Exception { 
		WSBindingProvider wsBindingProvider = (WSBindingProvider) client;
		wsBindingProvider.close();//Avoid resource leaking
	}
   
	public static IAquariusPublishService newAqPubClient(String url) throws Exception
	{
		return newAqPubClient(url, null, null);
	}
	
	@SuppressWarnings("resource")
	public static IAquariusPublishService newAqPubClient(String url, String user, String pwd) throws Exception {
		AquariusPublishService clientFactory = new AquariusPublishService(new URL(url), new QName("http://tempuri.org/", "AquariusPublishService"));
		IAquariusPublishService client = clientFactory.getBasicHttpBindingIAquariusPublishService();
		javax.xml.ws.BindingProvider basicBindingProvider = (javax.xml.ws.BindingProvider) client;
		basicBindingProvider.getRequestContext().put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
		
		if(!isNullOrEmpty(user) && !isNullOrEmpty(pwd))
		{
			String authToken = client.getAuthToken(user,  pwd);			
			WSBindingProvider wsBindingProvider = (WSBindingProvider) client;
			wsBindingProvider.setOutboundHeaders(
				com.sun.xml.ws.api.message.Headers.create(new QName("AQAuthToken"), authToken)
				);
		}
		return client;
	}
	
	
	
  
	
}
