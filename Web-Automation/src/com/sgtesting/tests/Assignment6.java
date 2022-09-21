package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver oBrowser=null;


	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
		 private static void createCustomer()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[1]")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//div [text()='Add New']")).click();
				 Thread.sleep(1500);
				 oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				 Thread.sleep(1500);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Ravi");
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(1500);
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		 private static void createProject()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//div [text()='Add New']")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("HP Aurora");
				 Thread.sleep(3000);
				
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
				 Thread.sleep(5000);
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		 private static void modifyProject()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("Involves claims Processing");
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				 Thread.sleep(3000);
			}catch(Exception e)
			{
				 e.printStackTrace();
			}
		 }
		 private static void deleteProject()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
				 Thread.sleep(3000);
				 
				 oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
				 Thread.sleep(3000);
			 
		     }catch(Exception e)
		     {
			       e.printStackTrace();
		     }
		 }
		 private static void deleteCustomer()
	     {
				 try
				 {
					 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
					 Thread.sleep(3000);
					 oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
					 Thread.sleep(3000);
					 oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
					 Thread.sleep(3000);
					 oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
