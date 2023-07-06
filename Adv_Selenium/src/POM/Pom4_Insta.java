package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4_Insta 
{
	@FindBy(xpath="//input[@aria-label='Phone number, username, or email']")
	private WebElement unField;
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement pwdField;
	
	
	public Pom4_Insta(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void passUN(String un)
	{
		unField.sendKeys(un);
	}
	public void passPWD(String pwd)
	{
		pwdField.sendKeys(pwd);
	}
	
	
}
