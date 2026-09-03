package webDrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class positionOfBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
	Point  p=	driver.manage().window().getPosition();
	System.out.println(p);
	driver.quit();

	}

}
