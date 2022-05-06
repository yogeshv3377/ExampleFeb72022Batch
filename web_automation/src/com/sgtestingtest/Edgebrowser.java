package com.sgtestingtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {
   
			public static WebDriver oBrowser=null;
			public static void main(String[] args)
			{
				launchBrowser();
				navigate();
				closeApplication();
			}
			private static void launchBrowser()
			{
				try
				{
					System.setProperty("webdriver.edge.driver", "E:\\java automation\\web_automation\\library\\Driver\\msedgedriver.exe");
					oBrowser=new EdgeDriver();
				}catch(Exception e)
				{
					e.printStackTrace();;
				}
			}
			
			private static void navigate()
			{
				try
				{
					oBrowser.get("http://localhost/login.do");
					Thread.sleep(4000);
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
