package Browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genericwayopenbothbrowser {

	public static void main(String[] args) {
	String chromedriverpath=System.getProperty("user.dir")+("\\Execuitable\\chromedriver.exe");
	String geckodriverpath=System.getProperty("user.dir")+("\\Execuitable\\geckodriver.exe");	
	openbrowser(chromedriverpath,"chrome");
	openbrowser(geckodriverpath,"Firefox");
	}
 static void openbrowser(String driverpath,String browsername) {
	 if(browsername.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver",driverpath);//1-set driverexecuitable pth by using System.set(String key,String value) f
	WebDriver cdrive=new ChromeDriver();//2-crate object instance of chromedriver
	 }
	else if(browsername.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver", driverpath);//path execuite using systm.set property
		WebDriver fdrive=new FirefoxDriver();//creat firefox instance object
	}
	
	
	 }
 }

