package WebElementHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblazecategeory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , ".\\Execuitable\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe ");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicty wait
		cdriver.get("https://www.demoblaze.com/");
WebElement category=cdriver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
System.out.println(category.isDisplayed());
System.out.println(category.isEnabled());
System.out.println(category.getText().equals("CATEGORIES"));
WebElement phn=cdriver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
System.out.println(phn.isDisplayed());
System.out.println(phn.isEnabled());
System.out.println(phn.getText().equals("Phones"));
WebElement lap=cdriver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
System.out.println(lap.isDisplayed());
System.out.println(lap.isEnabled());
System.out.println(lap.getText().equals("Laptops"));
WebElement MON=cdriver.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
System.out.println(MON.isDisplayed());
System.out.println(MON.isEnabled());
System.out.println(MON.getText().equals("Monitors"));







	}

}
