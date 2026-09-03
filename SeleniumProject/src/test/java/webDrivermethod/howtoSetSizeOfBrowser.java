package webDrivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class howtoSetSizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		Dimension d=new Dimension(1,1);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.close();

	}

}
