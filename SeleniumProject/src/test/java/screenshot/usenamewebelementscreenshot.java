package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class usenamewebelementscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(05));
		 driver.get("https://facebook.com");
		WebElement Userid= driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		
		File source=Userid.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\screenshot\\srcshot\\useid.png");
		 FileHandler.copy(source, destination);
		 driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
