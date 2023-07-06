package Classwork_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_id_of_only_Parent_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io./demo/links/");
		Thread.sleep(2000);
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
	}
}
