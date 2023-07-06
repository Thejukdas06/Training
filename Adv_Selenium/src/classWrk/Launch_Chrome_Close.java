package classWrk;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./Softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(200);
		driver.close();
		driver.quit();
		
	}

}
