package com.aquarius.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.aquarius.DataAcquisition.IAQAcquisitionService;
import com.aquarius.ws.AqWsFactory;

public class AcquisitionServiceConnectTests {
	
	private void getAuthTokenTest(String url, String pwd, String usr, boolean basic)
	{
		try
		{
			IAQAcquisitionService client = basic ? AqWsFactory.newAqAcqBasicClient(url) : AqWsFactory.newAqAcqClient(url);
			Assert.assertTrue(client!=null);			
			String token = client.getAuthToken(TestContext.User, TestContext.Pwd);			
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
		getAuthTokenTest(TestContext.AcquisitionServiceUrl, TestContext.User, TestContext.Pwd, false);
	}
	
	@Test
	public void getAuthToken_BasicBinding_Succeeds() {
		getAuthTokenTest(TestContext.AcquisitionServiceBasicUrl, TestContext.User, TestContext.Pwd, true);
	}
	
	@Test
	public void getAuthToken_AqListener_WsHttpBinding_Succeeds() {
		getAuthTokenTest(TestContext.AcquisitionServiceAqListenerUrl, TestContext.User, TestContext.Pwd, false);
	}
	
	@Test
	public void getAuthToken_AqListener_BasicBinding_Succeeds() {
		getAuthTokenTest(TestContext.AcquisitionServiceAqListenerBasicUrl, TestContext.User, TestContext.Pwd, true);
	}

}
