package classWrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Title_matching_dynamicElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String titleC="Facebook";
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
	if(title.contains(titleC))
	{
		System.out.println("Title matching");
	}
	else
	{
		System.out.println("Title not matching");
	}
	}
}
