package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	@FindBy(xpath = "//a[text()='Register']")
	public WebElement registerLink;

	@FindBy(xpath = "//a[text()='Log in']")
	public WebElement loginLink;

	@FindBy(id = "small-searchterms")
	public WebElement searchTextfield;

	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "(//a[@href='/books'])[1]")
	public WebElement booksLink;
	
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
