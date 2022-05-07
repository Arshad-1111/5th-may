package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingcnfiirmationpop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");	
		//System.setProperty("webdriver.chrome.driver","\\Execuitable\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	//	WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//as the required element is present inside the frame, so need to switch our control inside frame first
		cdriver.switchTo().frame(0);
		
		cdriver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: "+cdriver.switchTo().alert().getText());
		cdriver.switchTo().alert().accept();
		cdriver.switchTo().alert().dismiss();
	}
		
		
	//	cdriver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//cdriver.switchTo().frame(0);
	//	cdriver.findElement(By.xpath("//button[text()='Try it']\")).click()"));
	//	System.out.println("msg is:" +cdriver.switchTo().alert().getText());
	//	cdriver.switchTo().alert().accept();
	//	cdriver.switchTo().alert().dismiss();;

	}

