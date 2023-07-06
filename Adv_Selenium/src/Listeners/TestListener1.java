package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC is passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC is skipped");
	}
	
}
