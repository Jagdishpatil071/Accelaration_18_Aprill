package com.alearts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/alerts";
	    WebDriver driver= bu.startup("ch", url);
	    
	    driver.findElement(By.id("promtButton")).click();
	    Alert alt = driver.switchTo().alert();
	    System.out.println(alt.getText());
	    alt.sendKeys("Jagdish-patil");
	    alt.accept();
	    System.out.println("Programe End ");
	}

}
