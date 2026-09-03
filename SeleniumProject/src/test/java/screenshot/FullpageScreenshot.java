package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class FullpageScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		
		driver.get("https://facebook.com/");
		
		HasFullPageScreenshot hpsc=(HasFullPageScreenshot)driver;
		 File source =hpsc.getFullPageScreenshotAs(OutputType.FILE);
		 // File Destination=new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\screenshot\\srcshot\\pag.png");
		  File Destination=new File("./screenshot/srcshot/fullpage.png");
		  FileHandler.copy(source, Destination);
		  

	}

}
