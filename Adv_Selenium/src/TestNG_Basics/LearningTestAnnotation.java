package TestNG_Basics;

import org.testng.annotations.Test;

public class LearningTestAnnotation 
{
	@Test(priority = 1)
	public void testCase1()
	{
		System.out.println("Hi I am Testcase1");
	}
	
	@Test(priority = -1)
	public void testcase2()
	{
		System.out.println("Hi I am Testcase2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("Hellooo");
	}
}
