package Classwrk_3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends_on_methods {
@Test
public void compose() 
{
	Reporter.log("Hello world",true);
}
@Test(dependsOnMethods = "compose")
public void sentItems()
{
	Reporter.log("Hello India",true);
}
@Test(dependsOnMethods = "sentItems")
public void trash()
{
	Reporter.log("Hello Hassan",true);
}
}
