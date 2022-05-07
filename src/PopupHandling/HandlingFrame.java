package PopupHandling;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");	
		//System.setProperty("webdriver.chrome.driver","\\Execuitable\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://jqueryui.com/droppable/");
		//1-switch to our control homeweb to frame by using Webelement two type
		
		
		//WebElement frame=cdriver.findElement(By.cssSelector(".demo-frame"));
		//cdriver.switchTo().frame(frame);
//or
	//	cdriver.switchTo().frame(cdriver.findElement(By.cssSelector(".demo-frame")));
		//2-switch to ur control homeweb to frame by using index
		cdriver.switchTo().frame(0);
		Actions action=new Actions(cdriver);
		WebElement drag=cdriver.findElement(By.id("draggable"));
		WebElement drop=cdriver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		//get our control to back our main menu
		cdriver.switchTo().defaultContent();
		cdriver.findElement(By.cssSelector(".logo")).click();
		
		
	}

}
