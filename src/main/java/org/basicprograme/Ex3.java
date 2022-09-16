package org.basicprograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {
public static void main(String[] args) {
	Ex3 obj= new Ex3();
	String url= "https://www.google.com";
    obj.launchBrowser("chrome",url);

	} 
	public void launchBrowser(String browserName,String url) {
		WebDriver driver= null;
		
		if (browserName.equalsIgnoreCase("ch") || browserName.equalsIgnoreCase("chrome")) {
    	
		System.setProperty("webdriver.chrome.driver","./Drivers./chromedriver_win32./chromedriver.exe");
	//	ChromeDriver driverCH =new ChromeDriver ();
		driver = new ChromeDriver();    //upcasting 
	//	driverCH.get("https://www.google.com");
	//	driverCH.get(url);

		    }else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver","./Drivers./edgedriver_win64./msedgedriver.exe");
		//	EdgeDriver driverEdge=  new EdgeDriver();
			driver= new EdgeDriver();  //upcasting
		//	driverEdge.get("https://www.google.com");
		//    driverEdge.get(url);
		   
		    }else if (browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver","./Drivers./geckodriver-v0.31.0-win64./geckodriver.exe");
		//	FirefoxDriver driverff = new FirefoxDriver();
			driver=new FirefoxDriver();   //upcasting
		//	driverff.get(url);
		}else {
			System.out.println("invalid browser");
		}
        driver.get(url);
	}

} 