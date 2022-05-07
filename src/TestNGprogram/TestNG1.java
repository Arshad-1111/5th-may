package TestNGprogram;

import org.testng.annotations.Test;

public class TestNG1 {
	@Test
	public void testCase4() {
		DispalyDetail();
		System.out.println("Hello, I am TC4 TestNG1 class");
		
			
		
	}
	
	
		
	
	@Test
	public void testCase3() {
		System.out.println("Hello, I am TC3 TestNG1 class");
		 DispalyDetail();
	}
	void DispalyDetail() {
		System.out.println("this is dispalydetail method of class testng");
	}
}
