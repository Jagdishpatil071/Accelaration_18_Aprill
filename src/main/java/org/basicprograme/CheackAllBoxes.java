package org.basicprograme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class CheackAllBoxes {

		public static void main(String[] args) {
		    System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://demoqa.com/checkbox";
		    WebDriver driver= bu.startup("ch", url);
		    
		    List<WebElement> all3cheakboxes= driver.findElements(By.cssSelector("li[class='rct-node rct-node-parent rct-node-expanded']"));
		    for(int i=0;i<all3cheakboxes.size();i++) {
			    bu.clickByJS(driver, all3cheakboxes.get(i));

		    }
	}

}
 