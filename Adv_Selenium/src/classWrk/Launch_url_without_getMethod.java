package classWrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_url_without_getMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.close();
	}

}
