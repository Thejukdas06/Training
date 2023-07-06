package TestScript;

import org.testng.annotations.Test;

import Generic_Script.GS_Insta;
import POM.Pom4_Insta;

public class TestRunner_Insta extends GS_Insta
{
@Test
public void test4() 
{
	Pom4_Insta p=new Pom4_Insta(driver);
	p.passUN("abc");
	p.passPWD("123");
	
	
	
}
}
