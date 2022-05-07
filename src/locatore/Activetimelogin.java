package locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activetimelogin {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+(".\\Execuitable\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverpath);
WebDriver cdriver=new ChromeDriver();
cdriver.get("https://demo.actitime.com/login.do");
String Expecttitle="actiTIME - Login";
String Actultitle=cdriver.getTitle();
if(Expecttitle.equals(Actultitle)){
	System.out.println("login page is open succesful");
}
else {
	System.out.println("either lpgin page not open or page title is changed");
}
//identityfy any required element from UI
WebElement usernameinputfield= cdriver.findElement(By.id("username"));
//remove exixting text from filed
usernameinputfield.clear();
//perform action to  element on filed using send key
usernameinputfield.sendKeys("admin" );
WebElement passwordinputfield=cdriver.findElement(By.name("pwd"));
passwordinputfield.clear();
passwordinputfield.sendKeys("manager");
WebElement loginbutton=cdriver.findElement(By.id("loginButton"));
loginbutton.click();



//cdriver.close();
	}

}
