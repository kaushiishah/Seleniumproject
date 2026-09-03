import org.testng.annotations.Test;

public class demo {
	@Test(priority=3)
    public static void creatcity() {
		System.out.println("noida is created");
    	
    }
	@Test(priority=3)
    public static void modifycity() {
		System.out.println("noida is now greater noida");
    	
    }
	@Test(priority=3)
    public static void deletecity() {
		System.out.println("greaternoida is deleted");
    	
    }
}
