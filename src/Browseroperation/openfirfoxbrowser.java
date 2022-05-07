package Browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirfoxbrowser {

	public static void main(String[] args) {
		String driverPath1 ="G:\\automationclasses\\workspace\\SeleniumPractice\\Execuitable\\geckodriver.exe";
		String driverpath2=".\\Execuitable\\geckodriver.exe";
		String driverpath3=System.getProperty("user.dir")+("\\Execuitable\\geckodriver.exe");
		//step1: set driver executable path by using System.setProperty(String key,String value)
System.setProperty("webdriver.gecko.driver", driverpath3 );
//step2: create an instance of Chrome Browser
//FirefoxDriver cdriver=new FirefoxDriver();
WebDriver cdrive=new FirefoxDriver();
}
		
	}


