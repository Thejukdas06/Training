package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swapping_valuesInTextfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Source%20code/Swapping.html");
		Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("a1"));
	ele.sendKeys(Keys.CONTROL+"ax");
	driver.findElement(By.id("a3")).sendKeys(Keys.CONTROL+"v");
	driver.findElement(By.id("a2")).sendKeys(Keys.CONTROL+"ax");
	driver.findElement(By.id("a1")).sendKeys(Keys.CONTROL+"v");
	driver.findElement(By.id("a3")).sendKeys(Keys.CONTROL+"ax");
	driver.findElement(By.id("a2")).sendKeys(Keys.CONTROL+"v");
	driver.close();
	}

}
