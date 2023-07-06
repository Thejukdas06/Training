package TestScript;

import org.testng.annotations.Test;

import Generic_Script.GS_FB;
import POM.Pom3;

public class TestRunner_Using_Generic extends GS_FB
{
	@Test
	public void test2()  
	{
		Pom3 p=new Pom3(driver);
		p.passUN("9632267796");
		p.passPWD("theju@696");
		p.clickButton();	
	}
	
	

}
