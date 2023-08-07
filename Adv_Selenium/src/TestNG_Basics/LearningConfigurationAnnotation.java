package TestNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningConfigurationAnnotation 
{
	@AfterMethod
	public void AMethod()
	{
		System.out.println("After Method");
	}
	@Test
	public void Annotations()
	{
		System.out.println("Annotations");
	}
	@BeforeSuite
	public void BSuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void ASuite()
	{
		System.out.println("After Suite");
	}
	@BeforeTest
	public void BTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void ATest()
	{
		System.out.println("After Test");
	}
	@BeforeClass
	public void BClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void AClass()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void BMethod()
	{
		System.out.println("Before Method");
	}

	
	
}
