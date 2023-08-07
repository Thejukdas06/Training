package TestNG_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider 
{
	@Test(dataProvider = "loginData")
	public void loginTest(String rowValue, String colValue)
	{
		System.out.println(rowValue);
		System.out.println(colValue);
	}
	
	@DataProvider(name="loginData")
	public String[][] testData()
	{
		String[][] data=new String[2][2];
		data[0][0]="Chaya";
		data[0][1]="Sonali";
		data[1][0]="Theju";
		data[1][1]="Will meet ASAP";
		return data;
		
	}
}
