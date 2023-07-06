package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 
{
@FindBy(id="email")
private WebElement unField;
@FindBy(id="pass")
private WebElement pwdField;
@FindBy(name="login")
private WebElement loginButton;

public Pom2(WebDriver driver)
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
public void clickButton()
{
	loginButton.click();
}
}
