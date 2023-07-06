package classWrk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_checkbox_in_SerialOrder_ReverseOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Source%20code/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> Ch = driver.findElements(By.xpath("//input"));
		int Count = Ch.size();
		System.out.println(Count);
		for (int i=0;i<Count;i++)
		{
			WebElement we = Ch.get(i);
			we.click();
			Thread.sleep(1000);
		}
		for(int i=Count-1;i>=0;i--)
		{
			WebElement we = Ch.get(i);
			we.click();
			Thread.sleep(1000);
		}
			
		}
}
