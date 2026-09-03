package Types_of_Execution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Datadriven {
	@Parameters({"bro","un","pwd"})
	@Test()
	public void commonData(String browser,String Usernamme,String Password) {
		System.out.println(browser);
		System.out.println(Usernamme);
		System.out.println(Password);
	}

}
