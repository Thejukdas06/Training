package Classwork_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_upload_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.id("box3"));
		WebElement dst = driver.findElement(By.id("box103"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}

}
