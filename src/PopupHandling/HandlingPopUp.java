package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");	
//System.setProperty("webdriver.chrome.driver","\\Execuitable\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
cdriver.manage().window().maximize();
cdriver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
//cdriver.get("https://www.tutorialspoint.com/test/index.htm");
cdriver.switchTo().frame(0);
cdriver.findElement(By.xpath("//button[text()='Try it']")).click();
System.out.println("Alert msg is"+cdriver.switchTo().alert().getText());
cdriver.switchTo().alert().accept();



	}

}
