package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String[][] values= {
				{"name","surname","address"},
				{"Vishal","Shinde","Pune"},
				
				{"Satya","Shinde","Pune"}
		};
		
String path = System.getProperty("user.dir")+"\\src\\excelFileHandling\\TestData.xls";
		
		FileInputStream file = new FileInputStream(path);
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sheet =wb.getSheet("Sheet2");
		
		for(int r=0;r<values.length;r++)
		{
			HSSFRow row= sheet.getRow(r);
			
			if(row==null)
			
				row=sheet.createRow(r);
			
			
			for (int c=0;c<values[0].length;c++)
			{
				HSSFCell cell = row.getCell(c);
				if (cell==null)
				
					cell=row.createCell(c);
					cell.setCellValue(values[r][c]);
				
			}
			
		}
		
		
				
		
		
		//cell.setCellValue("Vishal");
		
		FileOutputStream fileout = new FileOutputStream(path);
		wb.write(fileout);
		fileout.close();
		

	}

}
