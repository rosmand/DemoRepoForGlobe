package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.testBase.TestBase;

public class BuyScenerio extends TestBase {
	
	String expected_msg = "Order Created successfully";
	
	@Test
	public void buyShare() throws InterruptedException
	{
		Dashboardpage dash = new Dashboardpage();
		Thread.sleep(3000);
		dash.enterCompnayName("Axis");
		dash.clickOnCompanyOption();
		Thread.sleep(3000);
		Exchangepage exchange = new Exchangepage();
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		Assert.assertEquals(exchange.getStatusMsg(), expected_msg);
		
	}

}
