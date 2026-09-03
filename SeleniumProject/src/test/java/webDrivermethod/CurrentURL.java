package webDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver);
		driver.quit();
	}

}
