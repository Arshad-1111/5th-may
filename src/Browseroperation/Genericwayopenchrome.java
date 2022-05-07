package Browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericwayopenchrome {

	public static void main(String[] args) {
		String driverpath1="G:\\automationclasses\\workspace\\SeleniumPractice\\Execuitable\\chromedriver.exe";
		String driverpath2=".\\Execuitable\\chromedriver.exe";
		String driverpath3=System.getProperty("user,dir")+("\\Execuitable\\chromedriver.exe");
		//step1
		System.setProperty("webdriver.chrome.driver", driverpath1);
	WebDriver cdrive=new ChromeDriver();
	//WebDriver cdrive=new FirefoxDriver();
		

	}

}
