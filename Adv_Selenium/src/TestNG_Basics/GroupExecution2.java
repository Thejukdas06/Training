package TestNG_Basics;

import org.testng.annotations.Test;

public class GroupExecution2 
{
	@Test(groups = "Functional")
	public void SearchProductTest()
	{
		System.out.println("Search for the product");
	}
	@Test(groups = "System")
	public void MakePaymentTest()
	{
		System.out.println("Make a payment for the product");
	}
	@Test(groups = "System")
	public void OderDetailsTest()
	{
		System.out.println("Check for the order details");
	}
	@Test(groups = "Integration")
	public void ReviewProductTest()
	{
		System.out.println("Give a review for the product");
	}
}
