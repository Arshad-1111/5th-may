package TestNGprogram;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleAnnotation1 {
 // @BeforeTest
  @BeforeMethod
  public void openbrowser() {
	  System.out.println("chrome app is open and url is enter");
  }
  @Test(priority=1) 
  public void varifylogin() {
	  System.out.println("varify login page");
  }
 // @AfterTest
  @AfterMethod
	public void closeBrowser() {
		System.out.println("Browser instance is closed");
	}
  @Test(priority=2)
	public void createTask() {
		System.out.println("Task created Successfully");
}
}
