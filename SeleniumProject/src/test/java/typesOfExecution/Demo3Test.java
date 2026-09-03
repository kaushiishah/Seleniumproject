package typesOfExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3Test {
	
	@Test(groups="regression")
	public void case3() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(groups="smoke")
	public void case33() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(groups={"smoke","regression"})
	public void case333() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}

}
