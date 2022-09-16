package org.basicprograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class EnableOrDisableEx {

	public static void main(String[] args) {
    System.out.println("Programe Start");
    BaceUtility bu = new BaceUtility();
    String url ="https://demoqa.com/radio-button";
    WebDriver driver= bu.startup("ch", url);
    
    
   WebElement ele = driver.findElement(By.id("noRadio"));
   if (ele.isEnabled()) {
	   System.out.println("No RADIO BUTTON IS ENABLE");
   }else {
	   System.out.println("NO RADIO BUTTON IS DISABLE");
   }
   WebElement ele2 = driver.findElement(By.cssSelector("input[id=\'impressiveRadio\']"));
  bu.clickByJS(driver, ele2);
  if(ele2.isSelected()) {
	  System.out.println("Impressive radio button is selected ");
  }else {
	  System.out.println("impressive radio Button is not selected ");
  }
   System.out.println("programe END ");
	}
	
}
// in this programe we check wether the radio button is selected or not 
//click by js method 
