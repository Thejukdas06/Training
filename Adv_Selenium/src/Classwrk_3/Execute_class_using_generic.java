package Classwrk_3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Execute_class_using_generic extends Generic_script{
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")).click();
	}
}
