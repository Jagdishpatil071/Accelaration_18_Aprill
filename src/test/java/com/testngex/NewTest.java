package com.testngex;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void login () {
	  System.out.println("Login ");
	  
  }
  @Test(priority=5)
  public void logout () {
	  System.out.println("logout  ");
  }
  @Test(priority=2)
 public void programeStart  () {
	  System.out.println("Programe Start");
  }
  @Test(priority=4)
  public void programeExcution() {
	  System.out.println("Programe Excution ");
  }
  @Test (priority=3)
  public void programeperformed () {
	  System.out.println("programe performed ");
  }
}
