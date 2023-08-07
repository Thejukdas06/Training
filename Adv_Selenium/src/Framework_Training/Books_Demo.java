package Framework_Training;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PomRepository.BooksPage;
import PomRepository.WelcomePage;

public class Books_Demo extends Base_Test
{
	@Test
	public void books()
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.booksLink.click();
		
		BooksPage bp=new BooksPage(driver);
		
		Select s=new Select(bp.sortbyDropdown);
		s.selectByVisibleText("Name: A to Z");
		
		Select s1=new Select(bp.displayBySizeDropdown);
		s1.selectByVisibleText("4");
		
		Select s2=new Select(bp.viewasDropdown);
		s2.selectByVisibleText("List");
	}
}
