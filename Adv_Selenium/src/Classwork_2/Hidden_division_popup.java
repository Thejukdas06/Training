package Classwork_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='31']")).click();

	}

}
