package testnglistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failure");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}
	//ITestListner:onstart(),onfinish(),ontestsuccess(),ontestfailure()
	//rightclick ->Source->override/implemnts method
	

}
