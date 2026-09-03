package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		WebElement slider=driver.findElement(By.xpath("//input[@id='pulse-slider']"));
	int slidewidth=	slider.getSize().getWidth();
		
		Actions action =new Actions(driver);
		action.scrollToElement(slider).perform();
		
            Thread.sleep(2000);
         driver.quit();

	}

}
