package com.sgtestingtestwed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanch {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
	}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\java automation\\web_automation\\library\\Driver\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();;
			}
		}
	
}

