package webDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.redchillies.com/");
		
		driver.quit();
		
		
	}

}
