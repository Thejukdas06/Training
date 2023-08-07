package TestNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_SingleRead
{
	
	public  void  getData() throws EncryptedDocumentException, IOException
	{
		
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		int NumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(NumberOfRows);
		int NumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(NumberOfCells);
		for(int i=1; i<NumberOfRows;i++)
		{
			Row row = sheet.getRow(i);
		
		for(int j=0;j<NumberOfCells;j++)
		{
		String value = row.getCell(j).toString(); 
		System.out.print(value+ " ");
		}
		System.out.println();
		}
		 
		
	}
}
