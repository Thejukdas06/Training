package classWrk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_text_using_foreachloop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for (WebElement we : links) 
		{
			String t = we.getText();
			System.out.println(t);
		}

	}

}
