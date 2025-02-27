package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class DashboardTitleURLEx {

	public static void main(String[] args) {

		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startUp("ch", "http://localhost:92/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();

//		String expTitle = "actiTIME - Enter Time-Track";
//		String actTitle = driver.getTitle();

//		String expURL = "http://localhost:92/user/submit_tt.do";
//		String actURL = driver.getCurrentUrl();

		if ("actiTIME - Enter Time-Track".equals(driver.getTitle())) {

			System.out.println("Actual title matches with Expected title.");
		}

		else {

			System.out.println("Actual title DOES NOT match with Expected title.");
		}
		
		
		if("http://localhost:92/user/submit_tt.do".equals(driver.getCurrentUrl())) {
			
			System.out.println("Actual URL matches with Expected URL.");
		}
		
		else {
			
			System.out.println("Actual URL DOES NOT match with Expected URL.");
		}
		
		
		driver.findElement(By.id("logoutLink")).click();

	}
}
