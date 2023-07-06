package classWrk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_src_img {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int count =links.size();
		for(WebElement l:links)
		{
			String t = l.getAttribute("src");
			System.out.println(t);
		}
	}
}
