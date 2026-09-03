package webDrivermethod;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager {
	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com/");
		WebDriver driver1=WebDriverManager.firefoxdriver().create();
		driver1.get("https://www.instagram.com/");
		WebDriver driver2=WebDriverManager.edgedriver().create();
		driver2.get("https://www.myntra.com/");
		
	}

}
