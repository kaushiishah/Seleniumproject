package Basepackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	
	 @Test
	    public void verifyLoginPageTitle() {

	        String actualTitle = driver.getTitle();

	        Assert.assertTrue(actualTitle.contains("OrangeHRM"));

	        System.out.println("Title Verified Successfully");
	    }

	    @Test
	    public void verifyUsernameField() {

	        boolean status = driver.findElement(By.name("username")).isDisplayed();

	        Assert.assertTrue(status);

	        System.out.println("Username field is displayed");
	    }
	

}
