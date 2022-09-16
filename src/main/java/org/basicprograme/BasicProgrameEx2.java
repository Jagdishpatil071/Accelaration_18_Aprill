package org.basicprograme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class BasicProgrameEx2 {

	public static void main(String[] args) {
		    System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://www.facebook.com/login/";
		    WebDriver driver= bu.startup("ch", url);
		    
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jagdishpatil307@gmail.com");
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jp@12345");
		    driver.findElement(By.xpath("//button[@name='login']")).click();
		    
		  List<WebElement> allTabs = driver.findElements(By.xpath("//td/a[contains(@class,'content')]"));
		  for(int i=0;i<allTabs.size(); i++) {
		  WebElement ele= allTabs.get(i);
		  String text= ele.getAttribute("class");
		 
		   if(text.contains("selected")) {
				  	System.out.println(text);
				    	
				   }else {
			   System.out.println(text);
		   System.out.println("programe End");
				   }
		  }
		   //in this we see get atribute method
		   // we print tabs are presents
		    
		   WebElement timeTrackTab = driver.findElement(By.xpath("//a[div[text()='TIME-TRACK']]"));
		   String str = timeTrackTab.getAttribute("class");
		   if(str.contains("selected")) {
		   System.out.println("Time Track Tab is Selected");
		    	
		  }else {
		  System.out.println("Time Tab Is not selected");		
		  }
		  System.out.println("Programe end ");
	}
		 
}
