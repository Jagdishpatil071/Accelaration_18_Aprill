package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaceUtility;

public class WithoutSelectEx3 {

	public static void main(String[] args) {
		 System.out.println("Programe Start");
		    BaceUtility bu = new BaceUtility();
		    String url ="https://demoqa.com/select-menu";
		    WebDriver driver= bu.startup("ch", url);
		    
		//   WebElement ele= driver.findElement(By.xpath("#withOptGroup .css-1hwfws3"));
		    driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]")).click();
		  //  bu.scrollTillElementByJS(ele, driver);
		   // ele.click();
		    
		//    driver.findElement(By.xpath("//*[text()='Prof.']")).click();
		    driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]")).click();
	};
}//#selectOne .css-1hwfws3
//(//div[@class=\" css-1hwfws3\"])[3]
////div[@class=" css-1uccc91-singleValue"]