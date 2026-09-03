package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesname {
   public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Set<Cookie> cookies = driver.manage().getCookies();
	  System.out.println(" all cookies are : "+cookies);
	  System.out.println("total size of cookies:"+cookies.size());
	  for (Cookie cookie : cookies) {

          System.out.println("--------------------------------");

          System.out.println("Name     : " + cookie.getName());
          System.out.println("Value    : " + cookie.getValue());
          System.out.println("Domain   : " + cookie.getDomain());
          System.out.println("Path     : " + cookie.getPath());
          System.out.println("Expiry   : " + cookie.getExpiry());
          System.out.println("Secure   : " + cookie.isSecure());
          System.out.println("HttpOnly : " + cookie.isHttpOnly());
      }
	  
	  
	  
	  
	  
	  Cookie cookie = driver.manage().getCookieNamed("session-id");

      if(cookie != null)
      {
          System.out.println("Cookie Found");

          System.out.println(cookie.getName());

          System.out.println(cookie.getValue());
      }
      else
      {
          System.out.println("Cookie Not Found");
          
          
      }
      
      
      Cookie newCookie = new Cookie("Automation", "Selenium");

      driver.manage().addCookie(newCookie);

      System.out.println("New Cookie Added");
      System.out.println(newCookie);
driver.quit();
	  
	  
	  
	   
	   
   }
}
