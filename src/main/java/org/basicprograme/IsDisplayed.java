package org.basicprograme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class IsDisplayed {

	public static void main(String[] args) {
		    System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="http://localhost/login.do";
		    WebDriver driver= bu.startup("ch", url);
		    
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
            driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
            driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();
            
        WebElement ele=   driver.findElement(By.cssSelector("a[class=\"content reports\"]"));
        System.out.println("Text="+ele.getText()); 
        if (ele.isDisplayed()) {
        System.out.println(ele.getText());
        }
        List<WebElement> timetrack = driver.findElements(By.cssSelector("div[class=\"navBg withSubMenu\"]"));
        for(int i=0; i<timetrack.size(); i++) {
        	System.out.println(timetrack.get(i).getText());
        }
        System.out.println("programe end1 ");
          
	
	}
	   
}


//(By.cssSelector("a[class=\"content selected tt\"]"));
//div[class="label"]