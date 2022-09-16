package org.utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaceUtility {
	public WebDriver startup(String browserName,String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("ch") || browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","./Drivers./chromedriver_win32./chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();    //upcasting 

		}else if (browserName.equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver","./Drivers./edgedriver_win64./msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();  //upcasting

		}else if (browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("ff")) {
			//System.setProperty("webdriver.gecko.driver","./Drivers./geckodriver-v0.31.0-win64./geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();   //upcasting

		}else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		//upto celiniam 3
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//selenium 4 onwords
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//    driver.manage().window().minimize();
		driver.get(url);
		return driver;
	}
	public void waitForVisiblilityOfElement(WebDriver driver,int time, WebElement ele) {
		WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));

	}
	//public void waitForVisibilityByLocated(WebDriver driver,int time) {
	//WebDriverWait wt= new WebDriverWait(driver , Duration.ofSeconds(time));
	//wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutlink")));

	//}
	
	public void waitForVisibilityByLocated(WebDriver driver, int time, String type, String locator ) {
		WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(time));
		switch (type) {
		case "id": wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		break;
		case"css": wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator))); 
		break;
		case"Xpath": wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		break;
		case"className": wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		break;


		}
		}
		public void scrollTillElementByJS(WebElement ele, WebDriver driver ) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
        }
	    public void ScrollByPageDown(WebDriver driver, int NumOfScrolls ) {
		WebElement ele = driver.findElement(By.tagName("body"));
		for (int i=1; i<NumOfScrolls; i++) {
		ele.sendKeys(Keys.PAGE_DOWN);
		
		}

	}
        public void clickByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		}
}


	

