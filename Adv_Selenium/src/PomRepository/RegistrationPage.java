package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	
	@FindBy(id = "gender-female")
	public WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	public WebElement firstNameTextfield;

	@FindBy(id = "LastName")
	public WebElement lastNameTextfield;
	
	@FindBy(id = "Email")
	public WebElement emailTextfield;
	
	@FindBy(id = "Password")
	public WebElement passwordTextfield;
	
	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPwdTextfield;
	
	@FindBy(id = "register-button")
	public WebElement registerButton;
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
