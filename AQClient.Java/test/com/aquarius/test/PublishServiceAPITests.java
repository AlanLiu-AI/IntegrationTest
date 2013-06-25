package com.aquarius.test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.aquarius.Publish.IAquariusPublishService;
import com.aquarius.ws.AqWsFactory;

public class PublishServiceAPITests {

	private IAquariusPublishService clientProxy;
	
	@Before
	public void setUp() { 
		try
		{
			clientProxy = AqWsFactory.newAqPubClient(TestContext.PublishServiceUrl, TestContext.User, TestContext.Pwd);
		}
		catch(Exception ex)
		{
			fail("setUp failed...");
		}
   } 

	@After
	public void tearDown() { 
	   try
	   {
		   AqWsFactory.close(clientProxy);
	   }
		catch(Exception ex)
		{
			fail("tearDown failed...");
		}
   } 

	@Test
	public void IsConnectionValid_test() {
		Boolean isSessionValid = clientProxy.isConnectionValid();
		Assert.assertTrue(isSessionValid);
	}
	
	@Test
	public void keepConnectionAlive_test() {
		Boolean expectSessionAlive = clientProxy.keepConnectionAlive();
		Assert.assertTrue(expectSessionAlive);
	}

}
