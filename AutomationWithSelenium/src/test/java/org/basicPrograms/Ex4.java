package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class Ex4 {

	public static void main(String args[]) {

		GenericUtility gu = new GenericUtility();

		WebDriver driver = gu.startUp("ff", "https://vinodpawar.com");
		
		

	}
}
