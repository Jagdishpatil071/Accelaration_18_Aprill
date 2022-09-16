package org.basicprograme;

import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

public class BasicProgrameEx1 {

	public static void main(String[] args) {
    System.out.println("Programe Start");
    BaceUtility bu = new BaceUtility();
    String url ="http://localhost/login.do";
    WebDriver driver= bu.startup("ch", url);
    String expTitle= "actiTIME - Login";  // in testcase
    String actTitle= driver.getTitle();
    if (expTitle.equals(actTitle)) {
    	System.out.println("Page Title Are Mached");
    	}else {
    		System.out.println("page Title are NOt matched");
    		
    	}
    String expUrl= "http://localhost/login.do";
    String actUrl = driver.getCurrentUrl();
    if (expUrl.equals(actUrl)) {
    	System.out.println("Page Url Matches");
    	
    }else {
    	System.out.println("page url Does not matched");
    }
    System.out.println("Programe End");
	}

}
// programe For getTitle and getURl 
// we cheack in this programe both the actual and expected url and page title are matched or not 
