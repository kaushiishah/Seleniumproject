package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jumpintoframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.ndtv.com");
      Thread.sleep(3000);
    WebElement frame= driver.findElement(By.xpath("//img[@title='Foreigner On Mumbai-Delhi Train Sprays Fire Extinguisher, Dies During Probe']']"));
	////img[@title='Foreigner On Mumbai-Delhi Train Sprays Fire Extinguisher, Dies During Probe']
    
    
    
    driver.switchTo().frame(frame);
      
      driver.quit();
	
	
	
	}

}
