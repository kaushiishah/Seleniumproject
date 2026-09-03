package BasicSeleniumTask;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class passwordScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(05));
		 driver.get("https://facebook.com");
		WebElement PWD= driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		
		File source=PWD.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\screenshot\\srcshot\\password.png");
		 FileHandler.copy(source, destination);
		 driver.quit();

	}

}
