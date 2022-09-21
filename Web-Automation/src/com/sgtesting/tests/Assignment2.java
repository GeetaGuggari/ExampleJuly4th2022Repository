package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;


	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
		

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SampleAuto\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
		 private static void createUser()
		 {
			 try
			 {
				  oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				  Thread.sleep(2000);
				  oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				  Thread.sleep(2000);
				  oBrowser.findElement(By.name("firstName")).sendKeys("Vineet");
				  oBrowser.findElement(By.name("lastName")).sendKeys("Guggari");
				  oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
				  oBrowser.findElement(By.name("username")).sendKeys("VineetGuggari");
				  oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
				  oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
				  Thread.sleep(2000);
				  oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				  Thread.sleep(5000);
			 }catch(Exception e)
			 {
					e.printStackTrace();
			 }
		 }
		 private static void modifyUser()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[3]/span")).click();
				 oBrowser.findElement(By.xpath("//span[text()='Guggari, Vineet']")).click();
				 Thread.sleep(5000);
				 oBrowser.findElement(By.name("email")).clear();
				 Thread.sleep(2000);
				 oBrowser.findElement(By.name("email")).sendKeys("geeta2@gmail.com");
				 Thread.sleep(2000);
				 oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
					oBrowser.findElement(By.xpath("//span[text()='Nandi, Sanvi']")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
					Thread.sleep(2000);
					Alert oAlert=oBrowser.switchTo().alert();
					String content=oAlert.getText();
					System.out.println(content);
					oAlert.accept();
					Thread.sleep(5000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		 private static void logout()
			{
				try
				{
					oBrowser.findElement(By.linkText("Logout")).click();
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
					oBrowser.quit();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
}
