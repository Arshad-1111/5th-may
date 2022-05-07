package Browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActivetime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe ");
		WebDriver cdrive=new ChromeDriver();
		cdrive.get("https://demo.actitime.com/");
		System.out.println(cdrive.getTitle());
		System.out.println(cdrive.getCurrentUrl());



		//System.out.println(cdrive.get);



	}

}
