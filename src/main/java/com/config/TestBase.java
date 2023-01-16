package com.config;

//import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.keywords.UIKeywords;
import com.util.Environment;
/**
 * 
 * @author Sandip Kalambe
 *
 */
public class TestBase 
{
//	private static Logger log = Logger.getLogger(TestBase.class);
	@BeforeMethod
	public void setUp() throws Exception
	{
		String browserName = Environment.browser;
		if(browserName == null)
		{
			browserName = "Chrome";
			System.out.println("Set chrome as default browser");
//			log.info("Set chrome as default browser");
		}
		if(browserName.isEmpty())
		{
			browserName = "Chrome";
			System.out.println("Set chrome as default browser");
//			log.info("Set chrome as default browser");
		}
		UIKeywords.openBrowser(browserName);
		UIKeywords.launchUrl(Environment.url);    // use this when you save your url in environment.properties
	}
	
	@AfterMethod
	public void closeUP()  throws Exception
	{	
		UIKeywords.closeBrowser();
	}
	
}
