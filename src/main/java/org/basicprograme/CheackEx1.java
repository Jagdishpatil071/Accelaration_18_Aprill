package org.basicprograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class CheackEx1 {

	public static void main(String[] args) {
		 System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="http://demo.automationtesting.in/Register.html";
		    WebDriver driver= bu.startup("ch", url);
		    
		 WebElement ele = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		 ele.sendKeys("Ganesh");
		
		 WebElement ele2= driver.findElement(By.xpath("//input[@placeholder=\'Last Name\']"));
		 ele2.sendKeys("Patil");
		 
		// driver.findElement(By.xpath("//div[@class=\'ui-autocomplete-multiselect ui-state-default ui-widget\']"));)
        // driver.findElement(By.xpath("//div[@class=\'ui-autocomplete-multiselect ui-state-default ui-widget\']")).click();
         //bu.ScrollByPageDown(driver, 1);
       //  driver.findElement(By.xpath("//*[text()='Arabic']")).click();
         bu.scrollTillElementByJS(ele2, driver);

     
      driver.findElement(By.xpath("//option[@value=\"C++\"]")).click();
      driver.findElement(By.xpath("//*[text()='C']")).click();
      
      driver.findElement(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]")).click();
      System.out.println("Programe End");
	}

}
