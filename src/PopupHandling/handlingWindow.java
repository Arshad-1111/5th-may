package PopupHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");	
		//System.setProperty("webdriver.chrome.driver","\\Execuitable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);/
		driver.manage().window().maximize();
		driver.get("https://etrain.info/in");
		//get current homewindow id
	String homewebid=	driver.getWindowHandle();
System.out.println("current homewebid:"+homewebid);
//performing click operation to opening new /child linkid webpage
driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();
////get current allwindow id

Set<String>allwindowid=driver.getWindowHandles();
System.out.println("current homewebid:"+allwindowid);
//remove homeweb id into Allwebid so we get child id
allwindowid.remove(homewebid);
System.out.println("remove homeid so we get child id=:"+allwindowid);

//get child id using iteratoe
Iterator<String>iter= allwindowid.iterator();
//allwindowid.iterator().next();
String childwindid=iter.next();

//Switch control to child window
driver.switchTo().window(childwindid);
//or
//driver.switchTo().window(allwindowid.iterator().next());
//now we aloow to operation to child window
System.out.println("linked webpage :"+driver.getCurrentUrl());
System.out.println("linked webpage:"+driver.getTitle());
//close or quit current linked browse
driver.close();
//driver.quit();
//switch back to home page window in order to perform any required operation on that
driver.switchTo().window(homewebid);
System.out.println("e trin webpage :"+driver.getCurrentUrl());
System.out.println("e trin webpage:"+driver.getTitle());
//driver.close();
//driver.quit();

	}

}
