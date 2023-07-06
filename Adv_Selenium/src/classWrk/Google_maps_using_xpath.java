package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_maps_using_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysore");
		
	}

}
