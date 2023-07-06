package Classwrk_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_browser {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.google.com");
	
	}

}

