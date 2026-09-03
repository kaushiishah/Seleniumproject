import org.testng.Assert;
import org.testng.annotations.Test;

public class alwaysRun {
	

	
	@Test()
	public static void createcity() {
		Assert.assertTrue(true);
	    
			System.out.println("noida is created");
	    	
	    }
		@Test(dependsOnMethods="createcity")
	    public static void modifycity() {
			Assert.assertTrue(false);
			System.out.println("noida is now greater noida");
	    	
	    }
		@Test(dependsOnMethods="modifycity",alwaysRun=true)
	    public static void deletecity() {
			Assert.assertTrue(true);
			System.out.println("greaternoida is deleted");
	    	
	    }

}
