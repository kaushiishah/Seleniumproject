package fakerlibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import net.datafaker.providers.base.BaseFaker;

public class userdetails1 {
	
	
	
	

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        BaseFaker faker = new BaseFaker();

	        driver.get("https://example.com/register");

	        String firstName = faker.name().firstName();
	        String lastName = faker.name().lastName();
	        String email = faker.internet().emailAddress();
	        String phone = faker.phoneNumber().cellPhone();

	        driver.findElement(By.id("firstName"))
	              .sendKeys(firstName);

	        driver.findElement(By.id("lastName"))
	              .sendKeys(lastName);

	        driver.findElement(By.id("email"))
	              .sendKeys(email);

	        driver.findElement(By.id("phone"))
	              .sendKeys(phone);

	        driver.quit();
	    }
	}


