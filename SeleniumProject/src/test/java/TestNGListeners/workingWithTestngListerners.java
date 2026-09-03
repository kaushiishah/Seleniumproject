package TestNGListeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestListener;

public class workingWithTestngListerners implements  ITestListener  {
    @Override
    public void onTestStart(ITestResult result) {
System.out.println("____***__: Test Started"+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	System.out.println("_____****_____test pass"+result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
    	System.out.println("____***__: Test Failed:"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	System.out.println("____***__: Test Skipped:"+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext result) {
    	System.out.println("____***__: Test Finished"+result.getName());
    }

}