package classWrk;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Point p=new Point (200,300);
		driver.manage().window().setPosition(p);

	}

}
