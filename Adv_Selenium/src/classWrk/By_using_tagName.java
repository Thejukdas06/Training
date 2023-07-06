package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_using_tagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Thejswini%20GK/Desktop/src_code.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();

	}

}
