package Browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchromebroowser {

	public static void main(String[] args) {
		String driverpath1="G:\\automationclasses\\workspace\\SeleniumPractice\\Execuitable\\chromedriver.exe";
		//or
String driverpath2=".\\Execuitable\\chromedriver.exe";
//or
String driverpath3=System.getProperty("user.dir")+"\\Execuitable\\chromedriver.exe";

//step1-set driver executiable path by using System.setProperty(String key, String value)
System.setProperty("webdriver.chrome.driver", driverpath3);
//create instance crome driver
//ChromeDriver cdriver=new ChromeDriver();
WebDriver cdrive=new ChromeDriver();

	}

}
