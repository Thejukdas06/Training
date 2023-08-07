package TY_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Disabled_element {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Thejaswini");
		driver.findElement(By.name("lastname")).sendKeys("Krupadas");
		driver.findElement(By.name("reg_email__")).sendKeys("thejaswinikrupadas@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("thejaswinikrupadas@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Theju&123");
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByVisibleText("6");
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Mar");
		WebElement year= driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");

		WebElement ele = driver.findElement(By.name("custom_gender"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Hii';", ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		WebElement gender=driver.findElement(By.name("preferred_pronoun"));
		Select s3=new Select(gender);
		s3.selectByValue("1");
		
		driver.findElement(By.name("websubmit"));
		Thread.sleep(3000);
		driver.close();
		
	
		
	}

}
