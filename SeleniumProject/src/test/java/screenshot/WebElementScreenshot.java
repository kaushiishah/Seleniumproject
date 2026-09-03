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

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(05));
     driver.get("https://facebook.com/");
     
    WebElement Login= driver.findElement(By.xpath("//span[text()='Log in']"));
      //WebElement Login =driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
     
    // TakesScreenshot tks=(TakesScreenshot)driver;
     File source =Login.getScreenshotAs(OutputType.FILE);
     
     File Destination =new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\screenshot\\srcshot\\Login1.png");
     
 FileHandler.copy(source, Destination);
	}

}
