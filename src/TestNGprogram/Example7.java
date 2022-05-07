package TestNGprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//import utilities.SeleniumUtility;

public class Example7 {
  @Test
  public void loginlogoutactiveaplication() {
	System.setProperty("webdriver.chrome.driver", ".\\Execuitable\\chromedriver.exe") ; 
//	System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");	
	
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com/login.do");
	System.out.println("before login we get tiltie is:" +driver.getTitle());
	 
	 //validation using testng
	Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "either page not open or change");
	//or
	//Assert.assertEquals(driver.getTitle(),"actiTIME - Login" );
	//// identify the required element from the UI and perform required action 0-30
WebElement  Usrnmetext=driver.findElement(By.id("username"));
Usrnmetext.sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();;
WebElement logoutbutn=driver.findElement(By.linkText("Logout"));
//explicity wait
//WebDriverwait wait= new WebDriverwait(driver,20);
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(logoutbutn));
//wait.until(ExpectedConditions.elementToBeClickable(logoutbutn));
System.out.println("after log out titleis: "+driver.getTitle());
logoutbutn.click();
driver.close();
  }
@Test 
public void loginPageValidationInActitimeApplication() {
	System.setProperty("webdriver.chrome.driver", ".\\Execuitable\\chromedriver.exe") ; 
//	System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");	
	
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com/login.do");
	System.out.println("before login we get tiltie is:" +driver.getTitle());
	 
	 //validation using testng
	//Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "either page not open or change");
	//or
	Assert.assertEquals(driver.getTitle(),"actiTIME - Login" );
	WebElement usernametextfield=driver.findElement(By.id("username"));
	
	Assert.assertTrue(usernametextfield.isDisplayed());
	Assert.assertTrue(usernametextfield.isEnabled(),"username input is not functional");
	Assert.assertEquals(usernametextfield.getAttribute("placeholder"), "Username","Username input field placeholder name is changed");
	//Assert.assertEquals(usernametextfield.getAttribute("placeholder"),"Username","Username input field placeholder name is changed");
	
	//Identify remember check box
	
	WebElement checkBox=driver.findElement(By.name("remember"));
	Assert.assertTrue(checkBox.isDisplayed());
	Assert.assertTrue(checkBox.isEnabled(),"Checkbox is not functional");
	Assert.assertFalse(checkBox.isSelected(),"Checkbox is by defualt selected");
	
	checkBox.click();
	Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
	driver.close();
	

}


	
	
	 
  
}
