package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_and_deselect_multiple_options {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Source%20code/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Maruthi Hotel"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("k");
		Thread.sleep(1000);
		s.selectByVisibleText("Chicken Kabab");
		Thread.sleep(1000);
		s.deselectAll();

	}

}
