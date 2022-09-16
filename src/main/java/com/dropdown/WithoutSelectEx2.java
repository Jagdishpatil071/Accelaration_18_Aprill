package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

public class WithoutSelectEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/select-menu";
	    WebDriver driver= bu.startup("ch", url);
//	    
//	   driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[2]")).click();
//	   Thread.sleep(1000);
//	   System.out.println(driver.getPageSource());
//	   driver.findElement(By.xpath("//*[text()='Prof.']"));)
//		System.out.println("Programe End");
//		
		driver.findElement(By.xpath("(//div[@class=\" css-1wa3eu0-placeholder\"])[2]")).click();
		Thread.sleep(1000);
			

	    }

}
//"//*[text()=Group 1, option 1"