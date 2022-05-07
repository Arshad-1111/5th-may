package Browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actulloginwithhomepagevalidation {

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
	System.out.println("login page currect");
}
else {
	System.out.println("login page change or not currect");
}
cdriver.findElement(By.id("username")).sendKeys("admin");
cdriver.findElement(By.name("pwd")).sendKeys("manager");
cdriver.findElement(By.id("loginButton")).click();
WebElement logoutbutton=cdriver.findElement(By.id("logoutLink"));
WebDriverWait wait=new WebDriverWait(cdriver,20);
wait.until((ExpectedConditions.elementToBeClickable(logoutbutton)));
String actualhomepagetitle=cdriver.getTitle();
System.out.println("homepagetitle"+actualhomepagetitle);
String expecthomepagetiile="actiTIME - Enter Time-Track";
if(actualhomepagetitle.equals( expecthomepagetiile)) {
	System.out.println("login page open");
}
else {
	System.out.println("login page change or not open");
}
cdriver.findElement(By.id("logoutLink")).click();

//cdriver.close();

	}

}
