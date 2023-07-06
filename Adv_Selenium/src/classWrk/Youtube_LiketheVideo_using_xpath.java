package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_LiketheVideo_using_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Kgf2 movie trailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/JKa05nyUmuQ/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCNZoTgaiFK9K_kqa7rmF9pEgbjkA\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
	}

}
