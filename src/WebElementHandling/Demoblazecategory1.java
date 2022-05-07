package WebElementHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblazecategory1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , ".\\Execuitable\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe ");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicty wait
		cdriver.get("https://www.demoblaze.com/");
List<WebElement> cat=cdriver.findElements(By.cssSelector(".list-group>a"));
System.out.println(cat.size());
List<String> L=new ArrayList<String>();
L.add("CATEGORIES");
L.add("Phones");
L.add("Laptops");
L.add("Monitors");
for(int i=0;i<cat.size();i++) {
	 WebElement Categerious=cat.get(i);
	System.out.println( Categerious);
	System.out.println("********* Element of List is: " + Categerious.getText() + "*********");
	System.out.println(Categerious.isDisplayed());
	System.out.println(Categerious.isEnabled());
	Categerious.isSelected();
	System.out.println(Categerious.getText().equals(L.get(i)));
}


	}

}
