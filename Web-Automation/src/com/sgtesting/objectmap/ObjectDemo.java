package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectDemo{
	public Properties prop=null;
	public ObjectDemo(String Filename)
	{
		FileInputStream fin=null;
		try
		{
			String path=System.getProperty("user.dir");
			System.out.println(path);
			fin=new FileInputStream(path+"\\ObjectMap\\"+Filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String propertyvalue=prop.getProperty(logicalname);
			String[] locator=propertyvalue.split(";");
						
			switch (locator[0].toLowerCase()) 
			{
			case "id":
				by=By.id(locator[1]);
				break;
			case "name":
				by=By.name(locator[1]);
				break;
			case "xpath":
				by=By.xpath(locator[1]);
				break;
			case "linktext":
				by=By.linkText(locator[1]);
				break;
			case "cssselector":
				by=By.cssSelector(locator[1]);
				break;
			case "classname":
				by=By.className(locator[1]);
				break;
			case "tagname":
				by=By.tagName(locator[1]);
				break;
			case "partiallinktext":
				by=By.partialLinkText(locator[1]);
				break;
			default:
				break;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
