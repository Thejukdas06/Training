package Framework_Training;

import org.testng.annotations.Test;

import PomRepository.WelcomePage;

public class Welcome_Demo extends Base_Test
{
	@Test
	public void welcome()
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.searchTextfield.sendKeys("Books");
		wp.searchButton.click();
	}
}
