package org.basicprograme;

import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

import com.github.dockerjava.api.model.Driver;

public class BasicProgrameExx {

	public static void main(String[] args) {
		    System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://www.flipkart.com/";
		    WebDriver driver= bu.startup("ch", url);
		    
		    String exptitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		    String acttitle= driver.getTitle();
		    System.out.println("Title = " +acttitle);
		    if (exptitle.equals(acttitle)) {
		    	System.out.println("Title are matched ");
		    }
		    else {
		    	System.out.println("Title are Not Matched ");
		    }
		    System.out.println("Programe end");
            String expurl = "https://www.flipkart.com/";
            String currentturl=  driver.getCurrentUrl();
            if (expurl.equals(currentturl)) {
            	System.out.println("Url Are Matched ");
            }
            else {
            	System.out.println("URL Are Not Matched");
            }
            System.out.println("Programe End ");
		    }
	        
	       

}
