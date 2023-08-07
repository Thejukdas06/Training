package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage 
{
		
	
	
	@FindBy(id = "products-orderby")
	public WebElement sortbyDropdown;
	
	@FindBy(id = "products-pagesize")
	public WebElement displayBySizeDropdown;
	
	@FindBy(id = "products-viewmode")
	public WebElement viewasDropdown;
	
	public BooksPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
