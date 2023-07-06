package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Script.GS_DemoQA;
import POM.QA_Form;


public class Runner_QA extends GS_DemoQA
{
@Test
public void test() throws InterruptedException
{
	QA_Form q = new QA_Form(driver);
	q.passFN("Thejaswini");
	Thread.sleep(2000);
	q.passLN("G K");
	Thread.sleep(2000);
	q.passEmail("thejaswinigk.rpca8@gmail.com");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//label[text()='Female']"));
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	ele.click();
	Thread.sleep(2000);
	q.passNo("9632267796");
	Thread.sleep(2000);
	q.passDOB();
	driver.findElement(By.xpath("//div[text()='6']")).click();
	Thread.sleep(2000);
	q.clickChBox();	
	Thread.sleep(2000);
	q.UploadFile("C:\\Users\\Thejswini GK\\Downloads\\photo.jpg");
	WebElement ele1 = driver.findElement(By.id("currentAddress"));
	Point loc1 = ele1.getLocation();
	int x1 = loc1.getX();
	int y1 = loc1.getY();
	js.executeScript("window.scrollBy("+x1+","+y1+")");
	ele1.sendKeys("Hassan");
	Thread.sleep(3000);
	List<WebElement> allopt = driver.findElements(By.xpath("//div[@id='state']"));
			int count = allopt.size();
	for(int i=0; i<count;i++)
	{
		if(allopt.get(i).equals("NCR"))
		{
			allopt.get(i).click();
		}
	}
	List<WebElement> allopt1 = driver.findElements(By.xpath("//div[@id='city']"));
			int count1 = allopt1.size();
			for(int i=0; i<count1;i++)
			{
				if(allopt1.get(i).equals("Delhi"))
				{
					allopt1.get(i).click();
				}
			}
	WebElement ele2 = driver.findElement(By.id("submit"));
	Point loc2 = ele2.getLocation();
	int x2 = loc2.getX();
	int y2 = loc2.getY();
	js.executeScript("window.scrollBy("+x2+","+y2+")");
	
	
	ele2.click();
	
}
}
