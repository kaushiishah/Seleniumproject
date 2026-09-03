package webDrivermethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		Point p=new Point(100,555);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		System.out.println(p);
		driver.quit();
	}

}
