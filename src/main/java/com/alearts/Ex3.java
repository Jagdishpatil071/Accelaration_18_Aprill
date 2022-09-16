package com.alearts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaceUtility;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/alerts";
	    WebDriver driver= bu.startup("ch", url);
	    driver.findElement(By.id("timerAlertButton")).click(); 
	    
	    Ex3 obj = new Ex3();
	    if (obj.IsAlertPresent(driver, 10)) {
	    	System.out.println(driver.switchTo().alert());
	    }else {
	    	System.out.println("Alert is Not present ");
	    }
	    
	}
   // generic method 
	public boolean IsAlertPresent(WebDriver driver, int time) {
	WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(10));
	try {
		wt.until(ExpectedConditions.alertIsPresent());
		return true;
	} 
	catch (No AlertPresentException) {
		return false;
		
	}
}
}