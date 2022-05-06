package com.sgtestingtestwed;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lkiuh {

	public static void main(String[] args) {
		
		ChromeDriver chrome = null;
				try {
					System.setProperty("webdriver.chrome.driver", "E:\\java automation\\web_automation\\library\\Driver\\chromedriver.exe");
					chrome = new ChromeDriver();
					chrome.manage().window().maximize();
					chrome.get("https://ksp.karnataka.gov.in/");
					Thread.sleep(2000);
					
					//Click on the 'AlertBtn' to get the alert
					chrome.findElement(By.id("btn_id1")).click();
					Thread.sleep(2000);
					
					
					//Apply a check to verify the presence of the alert
					if(isAlertPresent(chrome) == true) {
						Alert oAlert = chrome.switchTo().alert();
						System.out.println(oAlert.getText());
						Thread.sleep(2000);
						
						oAlert.accept();
						Thread.sleep(2000);
					}else {
						System.out.println("No alert was found here.....!!!!!");
					}
					
					chrome.close();
				}catch(Exception e) {
					System.out.println(e);
				}
				finally {
					chrome = null;
				}
			}
			
			
			//Verify alert is present or not
			static boolean isAlertPresent(WebDriver oDriver) {
				try {
					oDriver.switchTo().alert();
					return true;
				}catch(NoAlertPresentException e) {
					return false;
				}
			}
		}

	


