package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createCustomer();
		createProject();
		createTask();
		deleteTask();

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
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Raju");
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
		 private static void createTask()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//div [text()='Add New Task']")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Processing a claim");
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[5]/div/input")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
				 Thread.sleep(3000);
				 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
		 private static void deleteTask()
		 {
			 try
			 {
				 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
				 Thread.sleep(3000);
				 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")).click();
				 Thread.sleep(3000);
				 //oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitTitle")).click();

                 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
                 Thread.sleep(3000);
                 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
                 Thread.sleep(3000);
                 oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
                 Thread.sleep(3000);
                 oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
                 Thread.sleep(3000);
                 
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }

}
