package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// modify user

public class Testobject2 {
	public static WebDriver oBrowser=null;
	public static Test1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logOut();
		closeBrowser();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SampleAuto\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new Test1(oBrowser);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logIn()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getNewUser().click();
			Thread.sleep(2000);
			oPage.firstnameTextField().sendKeys("Sachin");
			oPage.lastNameTextFiels().sendKeys("Patil");
			oPage.emailTextField().sendKeys("sachin@gmail.com");
			oPage.usernameTextField().sendKeys("sachin1");
			oPage.userPassword().sendKeys("sachu123");
			oPage.userPasswordRetype().sendKeys("sachu123");
			oPage.createUserButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try
		{
			oPage.existingUserClick().click();
			Thread.sleep(2000);
			oPage.usernameTextField().clear();
			oPage.usernameTextField().sendKeys("Ravi");
			Thread.sleep(2000);
			oPage.emailTextField().clear();
			oPage.emailTextField().sendKeys("ravi@gmail.com");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oPage.existingUserClick().click();
			Thread.sleep(2000);
			oPage.deleteUserButton().click();
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logOut()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeBrowser()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

	


