package com.auto.test.search;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Pegah Tavakoli
 *
 */
public class NavigateToGoogle {

	public static void main(String[] args) throws InterruptedException {
		
	//Create an instance of Chrome driver
    System.setProperty("webdriver.chrome.driver",
            "D:\\Seleniumdrivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    //Launch the google
	driver.get("https://encrypted.google.com/");
	
	//Search for Zoro app google play
	 WebElement element = driver.findElement(By.name("q"));
     element.sendKeys("Zoro app google play");
     element.submit();
     

     //Open Zoro in google Play
     driver.findElement(By.linkText("Zoro Taxi - Calling All Cabs - Android Apps on Google Play")).click();  
    
	//driver.quit();
	}

}
