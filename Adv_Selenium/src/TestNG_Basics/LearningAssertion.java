package TestNG_Basics;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestNG_Basics.ListenerImplementation.class)

public class LearningAssertion extends Base_Test
{
	@Test
	public void testCase()
	{
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Facebook");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Thejaswinikrupadas@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Theju@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		Assert.assertTrue(true);
		Assert.assertEquals("Hello", "Hey");
		Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
		ast.assertAll();
	}
}
