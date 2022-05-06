package com.sgtestingtestwed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assen6 {

	

		private static WebDriver oBrowser=null;
		public static void main(String[] args) 
		{
			launchbrowser();
			navigate();
			login();
			minimizeflyoutwindow();
			createcustomer();
			createproject();
			modifyproject();
			deletecustomer();
			logout();
			closeapp();
		}
		private static void launchbrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Example-Automation\\Automation\\Web-Automation\\library\\drivers\\chromedriver.exe");
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
				Thread.sleep(2000);
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
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("loginButton")).click();
				oBrowser.manage().window().maximize();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void minimizeflyoutwindow()
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
		private static void createcustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("DemoCustomer");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createproject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("DemoProject");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectDescriptionField\']")).sendKeys("Java Project");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifyproject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deletecustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
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
				oBrowser.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeapp()
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
