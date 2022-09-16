package org.basicprograme;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicPrograme {

	public static void main(String[] args) {
 String path= System.getProperty("user.dir");
 System.out.println("path :"+path);
	
//	System.setProperty("webdriver.chrome.driver","E:\\accelaration9march\\March_09_Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
//	ChromeDriver driverCH =new ChromeDriver ();
	 
  System.setProperty("webdriver.edge.driver","E:\\accelaration9march\\March_09_Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	 EdgeDriver driverEdge=  new EdgeDriver();
	
	System.setProperty("webdriver.gecko.driver","E:\\accelaration9march\\March_09_Selenium\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	FirefoxDriver driverff = new FirefoxDriver();
	
	System.out.println("Programe End");
	}
	

}
//"E:\accelaration9march\March_09_Selenium\Drivers\chromedriver_win32\chromedriver.exe"
//E:\accelaration9march\March_09_Selenium\Drivers\edgedriver_win64\Driver_Notes
//"E:\accelaration9march\March_09_Selenium\Drivers\edgedriver_win64"
//"E:\accelaration9march\March_09_Selenium\Drivers\edgedriver_win64\msedgedriver.exe"
//"E:\accelaration9march\March_09_Selenium\Drivers\geckodriver-v0.31.0-win64\geckodriver.exe"
// we write this programe for Run WEb driver by selewnium