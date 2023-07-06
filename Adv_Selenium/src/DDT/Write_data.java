package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.createRow(5);
		Cell c = r.createCell(3);
		c.setCellValue("adbc");
		
		FileOutputStream fos = new FileOutputStream("./Excel/TestData.xlsx");
		book.write(fos);
	}

}
