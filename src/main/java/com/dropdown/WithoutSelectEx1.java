package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class WithoutSelectEx1 {

	public static void main(String[] args) {
		    System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://demoqa.com/select-menu";
		    WebDriver driver= bu.startup("ch", url);
		    
		    WebElement ele= driver.findElement(By.xpath("(//div[@class=\' css-1wa3eu0-placeholder\'])[1]"));
		  //  bu.scrollTillElementByJS(ele, driver);  //scroll 
		    ele.click();  // click to open dropdown 
		    
		  //  String colorName[]= {"Green", "Red","Black" };
		   // for(int i=0; i<colorName.length ;i++) {
		    	driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]//*[text()='Blue']")).click();
		    	
		   // }
		    
		// driver.findElement(By.xpath(url))  
	    //driver.findElement(By.xpath(url))
	}

}
//(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[3]"));