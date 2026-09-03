import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class threadPollsize {
   
	@Test(invocationCount=4)
	public static void createcity() {
		

		WebDriver driver=new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("log into fb");
		driver.get("https://www.facebook.com/");
			driver.quit();
	    }
		@Test(invocationCount=5)
	    public static void modifycity() {
			Assert.assertTrue(true);
			WebDriver driver=new ChromeDriver();
			Assert.assertTrue(true);
			System.out.println("log into insta");
			driver.get("https://www.instagram.com/");
			driver.quit();
	    }
		@Test(invocationCount=3)
	    public static void deletecity() {
			Assert.assertTrue(true);
			System.out.println("greaternoida is deleted");
	    	
	    }

}
