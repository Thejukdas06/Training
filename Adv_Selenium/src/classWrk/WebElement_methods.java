package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Source%20code/sample.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("element not displayed");
		}
		boolean b1 = ele.isEnabled();
		if(b1)
		{
			System.out.println("element Enabled");
		}
		else
		{
			System.out.println("element not Enabled");
		}
		driver.close();	
	}

}
