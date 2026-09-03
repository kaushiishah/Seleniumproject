package webDrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geurlMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String stringg=driver.getTitle();
		System.out.println(stringg);
		Thread.sleep(2000);
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com/");
		String str=driver1.getTitle();
		System.out.println(str);
		WebDriver driver2=new EdgeDriver();
		driver2.get("https://facebook.com/");
		System.out.println(driver2.getTitle());
		
		
		
	}
}
