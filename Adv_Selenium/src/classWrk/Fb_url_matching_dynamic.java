package classWrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_url_matching_dynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Urlc="Facebook";
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String Url = driver.getTitle();
	if(Url.contains(Urlc))
	{
		System.out.println("Url matching");
	}
	else
	{
		System.out.println("Url is not matching");
	}
	}
}
