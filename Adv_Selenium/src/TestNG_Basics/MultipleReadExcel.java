package TestNG_Basics;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleReadExcel 
{
	public static Workbook book;
	
	public static void main(String[] args) 
	{
		readMultipleData("Login");
	}
	public static String[][] readMultipleData(String sheetName)
	{
		File file=new File("./TestData/TestData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(file);
			book=WorkbookFactory.create(fis);
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet(sheetName);
		int row_size=sheet.getPhysicalNumberOfRows();
		int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
		String [][] data=new String[row_size-1][col_size];
		
		for(int i=0; i<row_size-1;i++)
		{
			for(int j=0; j<col_size;j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();		
			}
		}
		return data;
		
		
	}

}
