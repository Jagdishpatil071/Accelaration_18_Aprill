package org.basicprograme;

import org.openqa.selenium.WebDriver;
import org.utilities.BaceUtility;

public class PracticeEx {

	        public static void main(String[] args) {
	    	 System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://www.facebook.com/login/";
		    WebDriver driver= bu.startup("ch", url);

	}

}
