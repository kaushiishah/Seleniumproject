package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotYouube {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(05));
    driver.get("https://www.youtube.com/");
    
    TakesScreenshot tks=(TakesScreenshot)driver;
    
    File source =tks.getScreenshotAs(OutputType.FILE);
    
    File destination =new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\screenshot\\srcshot\\youtube2.png");
    FileHandler.copy(source, destination);
    driver.quit();
    
		
		
		
		
		
		
		
		
		
		
	}

}
