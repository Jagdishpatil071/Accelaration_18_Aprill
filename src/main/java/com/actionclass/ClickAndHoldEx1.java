package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaceUtility;

public class ClickAndHoldEx1 {

	public static void main(String[] args) {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/droppable";
	    WebDriver driver= bu.startup("ch", url);
	    
	  WebElement src=   driver.findElement(By.id("draggable"));	 
	  WebElement dst = driver.findElement(By.id("droppable"));
	  
	 Actions act = new Actions(driver);
	 act.moveToElement(src).clickAndHold().moveToElement(dst).release().build().perform();
	 System.out.println("Programe End ");
	}

}
