package webDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceTest {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String str=driver.getPageSource();
		System.out.println(str);
		driver.quit();
		
	}
	
}

	
