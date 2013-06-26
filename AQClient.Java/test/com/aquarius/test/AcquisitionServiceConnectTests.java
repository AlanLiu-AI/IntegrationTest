package com.aquarius.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.aquarius.DataAcquisition.IAQAcquisitionService;
import com.aquarius.ws.AqWsFactory;

public class AcquisitionServiceConnectTests {	

	private void getAuthTokenTest(String host, String usr, String pwd, boolean basic, boolean isPeerAqListener)
	{
		String wsdlUrl, url;
		if(isPeerAqListener) {
			if(basic) {
				wsdlUrl = TestContext.AcquisitionServiceAqListenerBasicUrl;
				url = TestContext.AcquisitionServiceAqListenerBasicUrl;
			} else {
				wsdlUrl = TestContext.AcquisitionServiceAqListenerUrl;
				url = TestContext.AcquisitionServiceAqListenerUrl;
			}
		} else {
			if(basic) {
				wsdlUrl = TestContext.AcquisitionServiceUrl;
				url = TestContext.AcquisitionServiceBasicUrl;
			} else {
				wsdlUrl = TestContext.AcquisitionServiceUrl;
				url = TestContext.AcquisitionServiceUrl;
			}
		}	
		try
		{
			IAQAcquisitionService client = basic ? AqWsFactory.newAqAcqBasicClient(wsdlUrl, url) : AqWsFactory.newAqAcqClient(url);
			Assert.assertTrue(client!=null);			
			String token = client.getAuthToken(usr, pwd);			
			Assert.assertTrue(token!=null && token.length()>0);
			AqWsFactory.close(client);
		}
		catch(Exception ex)
		{
			fail(ex.toString());
		}
	}

	@Test
	public void getAuthToken_WsHttpBinding_Succeeds() {
		getAuthTokenTest(TestContext.Host, TestContext.User, TestContext.Pwd, false, false);
	}
	
	@Test
	public void getAuthToken_BasicBinding_Succeeds() {
		getAuthTokenTest(TestContext.Host, TestContext.User, TestContext.Pwd, true, false);
	}
	
	@Test
	public void getAuthToken_AqListener_WsHttpBinding_Succeeds() {
		getAuthTokenTest(TestContext.Host, TestContext.User, TestContext.Pwd, false, true);
	}
	
	@Test
	public void getAuthToken_AqListener_BasicBinding_Succeeds() {
		getAuthTokenTest(TestContext.Host, TestContext.User, TestContext.Pwd, true, true);
	}

}
