package Browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+("\\Execuitable\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", path);
		System.setProperty("webdriver.chrome.driver",".\\Execuitable\\chromedriver.exe");//EXECUITABLE PATH
		WebDriver cdrive=new ChromeDriver();// CREATECHROMEDRIVER INSTANCE
		cdrive.get("https://www.google.com/");

	//System.out.println(cdrive.getTitle());
	//System.out.println(cdrive.getCurrentUrl());
	String Sourcecode=cdrive.getPageSource();
	System.out.println("source code:"+Sourcecode);
	System.out.println(Sourcecode.length());
	System.out.println(cdrive.getTitle());
	System.out.println(cdrive.getCurrentUrl());
	
	
		
		
		
		
	}

}
