package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginlogoutfirefoxDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate1();
		login();
		minimize();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","D:\\SampleAuto\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate1()
	{
		try
		{
		 oBrowser.get("http://localhost/login.do");
		 Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
			 {
				 oBrowser.findElement(By.id("username")).sendKeys("admin");
				 oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				 oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				 Thread.sleep(5000);
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
	 }

	private static void minimize()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
		
		    e.printStackTrace();
	    }
	}
	private static void logout()
	{
	try 
	{
		oBrowser.findElement(By.linkText("logout")).click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

	 	
      private static void closeApplication()
      {
	       try
	       {
		       oBrowser.close();
	       }catch(Exception e)
	       {
		       e.printStackTrace();
	       }
    }
}



