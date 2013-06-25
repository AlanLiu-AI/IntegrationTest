package com.aquarius.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.aquarius.Publish.IAquariusPublishService;
import com.aquarius.ws.AqWsFactory;

public class PublishServiceConnectTests {
	
	private void getAuthTokenTest(String url, String usr, String pwd)
	{
		try
		{
			IAquariusPublishService client = AqWsFactory.newAqPubClient(url);
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
	public void getAuthToken_BasicBinding_Succeeds() {
		getAuthTokenTest(TestContext.PublishServiceUrl, TestContext.User, TestContext.Pwd);
	}

	@Test
	public void getAuthToken_AqListener_BasicBinding_Succeeds() {
		getAuthTokenTest(TestContext.PublishServiceAqListenerUrl, TestContext.User, TestContext.Pwd);
	}
	
	@Test
	public void getAuthToken_Http_Succeeds() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getAuthToken_AqListener_Http_Succeeds() {
		fail("Not yet implemented");
	}
	
}
