package webDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		String str=driver.getTitle();
		System.out.println(str);
		driver.close();
		
		
	}

}
