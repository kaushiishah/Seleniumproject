package TestNGListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.workingWithTestngListerners.class)

public class TestNGListenerDemo {
	
	@Test()
	public void test1() {
		System.out.println("this is test1 and i am insde test1");
	}
	@Test()
	public void test2() {
		System.out.println("this is test2 and i am insde test2");
		Assert.assertFalse(true);
	}
	@Test()
	public void test3() {
		System.out.println("this is test3 and i am insde test3");
		throw new SkipException("this test is skipeed");
		
	}
	@Test()
	public void test4() {
		System.out.println("this is test4 and i am insde test4");
	}
	@Test()
	public void test5() {
		System.out.println("this is test5 and i am insde test5");
		
	}
}
