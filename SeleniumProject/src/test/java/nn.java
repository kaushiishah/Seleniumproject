import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nn {
	public static void main(String[] args) {
		System.out.println("kkkkk");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		System.err.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
	}
}
