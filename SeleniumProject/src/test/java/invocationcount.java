import org.testng.Assert;
import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount=5)
	public static void createcity() {
		Assert.assertTrue(true);
	    
			System.out.println("noida is created");
	    	
	    }
		@Test(invocationCount=5)
	    public static void modifycity() {
			Assert.assertTrue(true);
			System.out.println("noida is now greater noida");
	    	
	    }
		@Test(invocationCount=3)
	    public static void deletecity() {
			Assert.assertTrue(true);
			System.out.println("greaternoida is deleted");
	    	
	    }

}
