package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.utilities.GenericUtility;

public class FlipkartNamePrice {

	public static void main(String[] args) {

		GenericUtility gu = new GenericUtility();
		
		WebDriver driver = gu.startUp("ch", "https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("iPhone 15 Pro Max 1 TB");
		
//		driver.findElement(By.cssSelector("._2iLD__")).click();
		driver.findElement(By.cssSelector("._2iLD__")).sendKeys(Keys.ENTER);		
		
		

	}

}
