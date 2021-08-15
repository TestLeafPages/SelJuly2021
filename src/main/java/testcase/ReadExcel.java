package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		//step1: set the path for the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//step2: Get into the worksheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//step3: To find the number of rows in my excel
		int rowCount = sheet.getLastRowNum(); //count the number of rows except the header
		System.out.println(rowCount);
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];
				
		  for (int i = 1; i <= rowCount; i++) {
			  
			  for (int j = 0; j < cellCount; j++) {
				
				  String text = sheet.getRow(i).getCell(j).getStringCellValue();
				  System.out.println(text); 
				  data[i-1][j] = text;
				  
			 }
 		  }
				
		//step to close the workbook
		wb.close();
		
		return data;
		
		//int rowCountIncludingFirstRow = sheet.getPhysicalNumberOfRows();
		//System.out.println(rowCountIncludingFirstRow);
		
		//step3: get into the row using index
		//XSSFRow row = sheet.getRow(2);
		
		//step4: get into the cell
		//XSSFCell cell = row.getCell(1);
		
		//step5: to read the data from a cell
		//String text = cell.getStringCellValue();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
