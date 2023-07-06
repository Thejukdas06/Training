package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Play_youtube_video {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Kgf movie trailer");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='ytp-inline-preview-scrim']")).click();

	}

}
