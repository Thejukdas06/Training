package TestNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningSingleReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Login");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String value = cell.toString();
		System.out.println(value);
		
	}

}
