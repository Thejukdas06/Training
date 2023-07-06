package classWrk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Typecaste_from_set_to_list {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		 TreeSet<String> t=new TreeSet<String>();
		 ArrayList<String> l=new ArrayList<String>(t);
		List<WebElement> opt = s.getOptions();
		int Count = opt.size();
		System.out.println(Count);
		for (WebElement we : opt) 
		{
		String text = we.getText();
		l.add(text);
		}
		Collections.sort(l);
		for (String l1:l)
		{
			System.out.println(l1);
		}

	}

}
