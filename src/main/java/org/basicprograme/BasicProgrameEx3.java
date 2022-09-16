package org.basicprograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

    public class BasicProgrameEx3 {

	public static void main(String[] args) {
		 System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://demoqa.com/radio-button";
		    WebDriver driver= bu.startup("ch", url);
		    
		    WebElement ele = (WebElement) driver.findElements(By.className("yesRadio"));
		    System.out.println("TExt="+ele.getText());
			
		    System.out.println("Programe Start");
	}
	 }
