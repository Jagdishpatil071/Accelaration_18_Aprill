package org.windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

public class Ex1 {

	public static void main(String[] args) {
		 System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://demoqa.com/browser-windows";
		    WebDriver driver= bu.startup("ch", url);
		    
		   String parentid1= driver.getWindowHandle();
		   driver.findElement(By.id("tabButton")).click();;
		    
		   String parentid2=driver.getWindowHandle();
		   
		   System.out.println("parentid1=" +parentid1);
		   System.out.println("parentid2=" +parentid2);

		    
	}

}
