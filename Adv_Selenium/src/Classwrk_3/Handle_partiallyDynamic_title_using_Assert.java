package Classwrk_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Handle_partiallyDynamic_title_using_Assert extends Generic_script 
{
@Test
public void test()
{
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("Facebook"));
	System.out.println("Hi");
}
}
