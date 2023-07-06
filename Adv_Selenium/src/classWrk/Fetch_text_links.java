package classWrk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_text_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement text = links.get(i);
			String t = text.getText();
			System.out.println(t);
		}

	}

}
