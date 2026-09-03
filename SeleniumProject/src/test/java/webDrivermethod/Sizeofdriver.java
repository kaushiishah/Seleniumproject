package webDrivermethod;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sizeofdriver {

	public static void main(String[] args) {
		
		WebDriver driver =new EdgeDriver();
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		driver.quit();

	}

}
