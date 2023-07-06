package Classwork_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_getUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("https://www.amazon.com/"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
