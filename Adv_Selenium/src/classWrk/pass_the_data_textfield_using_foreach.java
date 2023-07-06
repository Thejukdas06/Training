package classWrk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pass_the_data_textfield_using_foreach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/Selenium/textfields.html");
		Thread.sleep(2000);
		List<WebElement> text = driver.findElements(By.xpath("//input"));
		int count =text.size();
		for(WebElement l:text)
		{
			l.sendKeys("Thejaswini");
			Thread.sleep(2000);
		}
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			WebElement s = text.get(i);
			s.clear();
			Thread.sleep(2000);
			}
	}
}

