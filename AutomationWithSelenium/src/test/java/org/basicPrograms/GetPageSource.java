package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class GetPageSource {

	public static void main(String args[]) {

		GenericUtility gu = new GenericUtility();		
		WebDriver driver = gu.startUp("ch", "http://localhost:92/login.do");
		
		String pageSource = driver.getPageSource();
		
		System.out.println("DOM: " + pageSource);
		
		

	}
}
