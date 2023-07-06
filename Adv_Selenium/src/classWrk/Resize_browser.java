package classWrk;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resize_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Dimension d=new Dimension (200,300);
		driver.manage().window().setSize(d);
	}

}
