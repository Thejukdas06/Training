package classWrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Url_matching {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Urlc="https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String Url = driver.getCurrentUrl();
	if(Url.equals(Urlc))
	{
		System.out.println("Url matching");
	}
	else
	{
		System.out.println("Url not matching");
	}
	}
}
