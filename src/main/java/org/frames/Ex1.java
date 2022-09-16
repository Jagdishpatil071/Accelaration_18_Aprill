package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class Ex1 {

	public static void main(String[] args) {
		   System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://demoqa.com/frames";
		    WebDriver driver= bu.startup("ch", url);
		   WebElement ele= driver.findElement(By.id("frame1"));  
		   driver.switchTo().frame(ele);
		//   driver.switchTo().frame("frame");

		   
		   WebElement ele2 = driver.findElement(By.id("sampleHeading"));
		   System.out.println("Text1=" +ele2.getText());
		   
		   driver.switchTo().defaultContent();   // root html 
		   driver.switchTo().frame("frame2");
		  String txt= driver.findElement(By.id("sampleHeading")).getText();
		  System.out.println("text2=" +txt);
		  System.out.println("programe End");
		   
		   }  

}
//id="frame1"