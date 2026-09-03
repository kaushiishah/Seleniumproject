package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IDname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("kaushal",Keys.ENTER);
		WebElement Mailid=driver.findElement(By.id("email"));
		Mailid.sendKeys("kaushi9346@gmail.com",Keys.ENTER);
		WebElement Mailidpassword=driver.findElement(By.id("password"));
		Mailidpassword.sendKeys("kaushi9346@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
