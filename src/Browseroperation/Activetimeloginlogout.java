package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activetimeloginlogout {

	public static void main(String[] args) {
	String driverpath=System.getProperty("user.dir")+(".\\Execuitable\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",driverpath);
	WebDriver cdriver=new ChromeDriver();
	cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicty wait
	cdriver.get("https://demo.actitime.com/login.do");
	String exceptedtitle="actiTIME - Login";
	String Actultilte=cdriver.getTitle();
	System.out.println(Actultilte);
	if(Actultilte.equals(exceptedtitle)) {
		System.out.println("login pahe open");
	}
	else {
		System.out.println("login page not open or change name");
	}
	//cdriver.clear();
	cdriver.findElement(By.id("username")).sendKeys("admin");
	cdriver.findElement(By.name("pwd")).sendKeys("manager");
	cdriver.findElement(By.id("loginButton")).click();
//	cdriver.findElement(By.linkText("Logout")).click();
	cdriver.findElement(By.id("logoutLink")).click();
	//cdriver.close();
	}

}
