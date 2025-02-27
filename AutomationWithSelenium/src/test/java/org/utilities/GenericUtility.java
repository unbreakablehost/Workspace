package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GenericUtility {

	public WebDriver startUp(String bName, String URL) {

		WebDriver driver = null;

		if (bName.equalsIgnoreCase("ch")) {

			ChromeOptions options = new ChromeOptions();
			// This Option will start browser in maximized mode
			options.addArguments("--start-maximized");

			// This Option will disable pop up message for Allow Notifications
			options.addArguments("--disable-notifications");

//			This will start browser without UI
//			options.addArguments("--headless");

			driver = new ChromeDriver(options);

		}

		else if (bName.equalsIgnoreCase("edge")) {

			EdgeOptions options = new EdgeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			driver = new EdgeDriver(options);
		}

		else if (bName.equalsIgnoreCase("ff")) {

			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
		}

		else {

			System.out.println("Invalid input!");
		}
		
		driver.get(URL);
		return driver;

	}

}
