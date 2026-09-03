package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("totalnumber of links in ninjademois---"+links.size());
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		List<WebElement> linksQSP =driver.findElements(By.tagName("a"));
		System.out.println("totalnumber of links in DemoappsQSP----"+linksQSP.size());
		
	}

}
