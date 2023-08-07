package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
@FindBy(id = "Email")
public WebElement emailTextfield;

@FindBy(id = "Password")
public WebElement passwordTextfield;

@FindBy(id = "RememberMe")
public WebElement rememberMeCheckbox;

@FindBy(xpath = "//input[@value='Log in']")
public WebElement loginButton;

public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

}
