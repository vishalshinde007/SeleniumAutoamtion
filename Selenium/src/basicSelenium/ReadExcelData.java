package basicSelenium;

import java.io.IOException;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Xls_Reader obj = new Xls_Reader("D:\\CodeBase\\SeleniumAutoamtion\\BasicCoreJava\\src\\excelFileHandling\\TestData.xls");
     // System.out.println(obj.getrowcount("Sheet4"));
      
      int rows = obj.getrowcount("Sheet4");
      int cols = obj.getColumncount("Sheet4");
      
      System.out.println(rows);
      System.out.println(cols);
      
      String str= obj.getCellData("Sheet4", 1, 1);
      System.out.println(str);
      
      String str2= obj.getCellData("Sheet4", 2, "LastName");
      System.out.println(str2);
      
      obj.setCellData("Sheet4", "LastName", 3, "Shinde1");
      
	}

}
