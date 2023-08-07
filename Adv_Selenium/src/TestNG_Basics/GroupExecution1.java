package TestNG_Basics;

import org.testng.annotations.Test;

public class GroupExecution1 
{
	@Test(groups = "Functional")
	public void RegisterTest()
	{
		System.out.println("Register to application");
	}
	@Test(groups = "Functional")
	public void LoginTest()
	{
		System.out.println("Login to application");
	}
	@Test(groups = "Integration")
	public void AddToCartTest()
	{
		System.out.println("Add product to the cart");
	}
	@Test(groups = "Integration")
	public void AddToWishlistTest()
	{
		System.out.println("Add product to the wishlist");
	}
}
