package classWrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_Hight_without_cssvalue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		int h = ele.getSize().getHeight();
		System.out.println(h);
		int w = ele.getSize().getWidth();
		System.out.println(w);
		driver.close();

	}

}
