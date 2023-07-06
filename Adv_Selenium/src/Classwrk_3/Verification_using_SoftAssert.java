package Classwrk_3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_using_SoftAssert extends Generic_script {
@Test
public void test() 
{
	String title = driver.getTitle();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title, "hello");
	System.out.println("Good night");
	sa.assertAll();
}
}
