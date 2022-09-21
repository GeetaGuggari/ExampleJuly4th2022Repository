package com.sgtesting.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoluteCSS();
		//relativeCSSUsingTagName();
		relativeCSSUsingTagNameWithIDAttributeValue();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SampleAuto\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	  }	
	
	  private static void navigate()
	  {
		    try
		    {
			      oBrowser.get("file:///C:/html/sampleDemo.html");
			      Thread.sleep(5000);
		     }catch(Exception e)
		     {
			       e.printStackTrace();
		     }
	    } 
	   private static void absoluteCSS()
	   {
		
		    oBrowser.findElement(By.cssSelector("html body form input")).sendKeys("DemoUser1");
		
	   }
	   private static void relativeCSSUsingTagName()
	   {
		
		   oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
		
	   }
	   private static void relativeCSSUsingTagNameWithIDAttributeValue()
		{
			oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
		}
	

	

}
