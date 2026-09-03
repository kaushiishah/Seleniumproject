package webDrivermethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchtomethod {
	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("ek ajnabi hasina se mulakaat ",Keys.ENTER);
		driver.quit();
	}

}
