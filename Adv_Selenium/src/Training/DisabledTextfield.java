package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextfield {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		WebElement disabledTextfield = driver.findElement(By.id("displayed-text"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Hiii';", disabledTextfield);
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
