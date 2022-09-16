package org.basicprograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class Ex2 {


	public static void main(String[] args) {
	    
	    	 System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="http://localhost/login.do";
		    WebDriver driver= bu.startup("ch", url);
		    
		  WebElement uname = driver.findElement(By.xpath("//form[@id='loginForm']"));
		    uname.sendKeys("admin");
		 
         WebElement pwd=   driver.findElement(By.xpath("//input[@name=\'pwd\']"));
           pwd.sendKeys("manager");
		
	        driver.findElement(By.cssSelector("#loginButton")).click();
	        
	     //   bu.waitForVisibilityByLocated(driver, 20, css, "#logoutLink
		    
	    	 System.out.println("Programe End");

		
	}

}
