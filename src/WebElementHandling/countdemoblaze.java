package WebElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countdemoblaze {

	public static void main(String[] args) {
		
		String driverpath=System.getProperty("user.dir")+(".\\Execuitable\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cdriver.get("https://www.demoblaze.com/");
		
		List<WebElement>count= cdriver.findElements(By.id("#tbodyid>div>div>div>h4>a"));
		System.out.println("Device count: "+count.size());
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText());
		}
	}

}
