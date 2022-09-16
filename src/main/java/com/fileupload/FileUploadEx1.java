package com.fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaceUtility;

public class FileUploadEx1 {

	public static void main(String[] args) {
		System.out.println("Programe Start");
	    BaceUtility bu = new BaceUtility();
	    String url ="https://demoqa.com/automation-practice-form";
	    WebDriver driver= bu.startup("ch", url);
	    
	    WebElement ele = driver.findElement(By.id("uploadPicture"));
	    bu.scrollTillElementByJS(ele, driver);
	    
	    Actions act = new Actions(driver);
	    act.click(ele).perform();
	    
	    try {
			Runtime.getRuntime() .exec("E:\\accelaration9march\\March_09_Selenium\\FileUpload\\ChromeUpload.au3");
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	    System.out.println("programe End ");
	     
	    }

}
