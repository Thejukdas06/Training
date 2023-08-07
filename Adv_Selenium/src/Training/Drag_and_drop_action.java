package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop_action {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.id("box3"));
		WebElement dst = driver.findElement(By.id("box103"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Southkorea = driver.findElement(By.id("box105"));
		Thread.sleep(3000);
		act.clickAndHold(Seoul).release(Southkorea).perform();

	}

}
