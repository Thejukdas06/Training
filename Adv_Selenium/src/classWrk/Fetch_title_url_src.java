package classWrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_title_url_src {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String titleC="Facebook – log in or sign up";
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
	if(title.equals(titleC))
	{
		System.out.println("Title matching");
	}
	else
	{
		System.out.println("Title not matching");
	}
	}
}
