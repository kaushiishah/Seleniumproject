package TestNGListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testNGListenerDemo2 {
	
	@Test()
	public void test2() {
		System.out.println("this is test2 and i am insde test2");
	}
	@Test()
	public void test22() {
		System.out.println("this is test2 and i am insde test2");
		Assert.assertFalse(true);
	}
	@Test()
	public void test222() {
		System.out.println("this is test3 and i am insde test3");
		throw new SkipException("this test is skipeed");
		
	}
	@Test()
	public void test2222() {
		System.out.println("this is test4 and i am insde test4");
	}
	@Test()
	public void test22222() {
		System.out.println("this is test5 and i am insde test5");
		
	}
}


