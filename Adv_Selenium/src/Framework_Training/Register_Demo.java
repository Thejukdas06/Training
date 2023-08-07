package Framework_Training;

import org.testng.annotations.Test;

import PomRepository.RegistrationPage;
import PomRepository.WelcomePage;

public class Register_Demo extends Base_Test
{
	@Test
	public void Register()
	{
		WelcomePage wp=new WelcomePage(driver);
		wp.registerLink.click();
		
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.femaleRadioButton.click();
		rp.firstNameTextfield.sendKeys("Thejaswini");
		rp.lastNameTextfield.sendKeys("GK");
		rp.emailTextfield.sendKeys("Thejaswinikrupadas@gmail.com");
		rp.passwordTextfield.sendKeys("Theju@123");
		rp.confirmPwdTextfield.sendKeys("Theju@123");
		rp.registerButton.click();
		
		
		
	}
}
