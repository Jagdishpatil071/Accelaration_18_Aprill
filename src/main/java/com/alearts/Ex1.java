package com.alearts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/alerts";
	    WebDriver driver= bu.startup("ch", url);
	    
	 //   driver.findElement(By.id("alertButton")).click();)
          driver.findElement(By.id("alertButton")).click();
           
          Alert alt = driver.switchTo().alert();
         System.out.println(alt.getText());
         System.out.println("Programe End");
	}

}
