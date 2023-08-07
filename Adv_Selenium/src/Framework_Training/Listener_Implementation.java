package Framework_Training;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Implementation implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Framework_Liberary.screenshot();
	}
}
