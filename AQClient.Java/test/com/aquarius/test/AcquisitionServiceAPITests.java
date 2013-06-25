package com.aquarius.test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.aquarius.DataAcquisition.*;
import com.aquarius.ws.AqWsFactory;

public class AcquisitionServiceAPITests {
	
	private IAQAcquisitionService clientProxy;
	
	@Before
	public void setUp() { 
		try
		{
			clientProxy = AqWsFactory.newAqAcqClient(TestContext.AcquisitionServiceUrl, 
					TestContext.User, TestContext.Pwd);
		}
		catch(Exception ex)
		{
			fail("setUp failed: " + ex.toString());
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
			fail("tearDown failed: " + ex.toString());
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
