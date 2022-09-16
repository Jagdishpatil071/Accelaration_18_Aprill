package org.basicprograme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaceUtility;

public class OpenActtimeEx1 {

	public static void main(String[] args) {
    BaceUtility bu = new BaceUtility();
    String url ="http://localhost/login.do";
    WebDriver driver= bu.startup("ch", url);
   
   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
   driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
   driver.findElement(By.cssSelector("#loginButton>div")).click();
   
   WebElement logoutLink= driver.findElement(By.id("logoutLink"));
  // bu.waitForVisiblilityOfElement(driver,15 , "logoutLink");
  //bu.waitForVisiblilityOfElement(driver, 15, "logoutLink");
   
   bu.waitForVisibilityByLocated(driver, 15, "id", "logoutLink");
  // WebDriverWait wt =new WebDriverWait(driver, Duration.ofSeconds(10));
   
   driver.findElement(By.id("logoutLink")).click();
	}

}

