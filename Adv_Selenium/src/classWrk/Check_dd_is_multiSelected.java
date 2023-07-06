package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_dd_is_multiSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Source%20code/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Maruthi Hotel"));
		Select s=new Select(ele);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("Multi select dropdown");
		}
		else
		{
			System.out.println("Not a multi select drop down");
		}
	}

}
