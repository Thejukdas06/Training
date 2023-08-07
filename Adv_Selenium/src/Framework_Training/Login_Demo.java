package Framework_Training;

import org.testng.annotations.Test;

import PomRepository.LoginPage;
import PomRepository.WelcomePage;

public class Login_Demo extends Base_Test
{
	@Test
	public void Login()
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.loginLink.click();
		LoginPage lp=new LoginPage(driver);
		lp.emailTextfield.sendKeys("Thejaswinikrupadas@gmail.com");
		lp.passwordTextfield.sendKeys("Theju@123");
		lp.rememberMeCheckbox.click();
		lp.loginButton.click();
		
		

	}
}
