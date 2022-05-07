package TestNGprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Anatationexmple3 {
  @Test(priority=1)
  public void varifiloginpage() {
	 System.out.println("succesful login");
  }
	 @Test
	 public void creattast() {
		 System.out.println("creat task");
	 }
	  
  
  @BeforeMethod
  public void enterappurl() {
	  System.out.println("app url is enter");
  }

  @AfterMethod
  public void logout() {
	  System.out.println("log out to page");
  }

  @BeforeTest
  public void openbrowse() {
	  System.out.println("browser page is open");
  }

  @AfterTest
  public void closebrowser() {
	  System.out.println("close browser page");
  }

}
