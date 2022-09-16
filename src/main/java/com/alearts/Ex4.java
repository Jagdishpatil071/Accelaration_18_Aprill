package com.alearts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaceUtility;

public class Ex4 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/alerts";
	    WebDriver driver= bu.startup("ch", url);
	    driver.findElement(By.id("timerAlertButton")).click(); 
	    
	   
	}

}
