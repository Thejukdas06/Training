package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_Facebook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		Row r1 = sh.getRow(0);
		Cell c1 = r1.getCell(1);
		String value = c.toString();
		String value1 = c1.toString();
		System.setProperty("webdriver.chrome.driver", 
				"./Software_2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(value);
		driver.findElement(By.id("pass")).sendKeys(value1);
		driver.findElement(By.name("login")).click();
	}
}
