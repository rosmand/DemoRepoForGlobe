package com.utility;

import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	//url get 
	public String getUrl()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}
}
