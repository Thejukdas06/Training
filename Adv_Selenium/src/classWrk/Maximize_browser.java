package classWrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

	}

}
