package WebElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElement {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+(".\\Execuitable\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicty wait
		cdriver.get("https:google.com");
cdriver.findElement(By.name("q")).sendKeys("selenieium testing ");//chk element in serch and type on selenium
	//identify all suggestion given by google
//List<WebElement> option= cdriver.findElements(By.cssSelector("ul[class=erkvQe]>li>div>div>span"));
List<WebElement> option= cdriver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div[1]/span"));

	//count of option
int countoption=option.size();
System.out.println("count of option is:" +countoption);
//print all option name one by one
for(int i=0;i<countoption;i++) {
	System.out.println( option.get(i).getText());
}
	
	}
}
//}
