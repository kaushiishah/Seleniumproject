package screenshot;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v146.page.model.Screenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class takesScreenshot {
	
	
	
	public static void main(String[] args) throws IOException {
		WebDriver driver =new EdgeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	driver.get("https://facebook.com/");
	TakesScreenshot tks= (TakesScreenshot)driver;
	 File source =tks.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\screenshot\\srcshot.png");
	
	FileHandler.copy(source, destination);
		driver.quit();
		}
	
	 

}
