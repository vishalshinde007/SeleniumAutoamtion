package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibraries;
import pages.HomePage;
import utilities.Xls_Reader;

public class TestScript1 {
	
	@Test(dataProvider="getdata2")
	public void loginTest(String username, String password)
	{
		ApplicationLibraries lib =new ApplicationLibraries();
		
		WebDriver dr=lib.launchbrowser();
		
		HomePage page1= new HomePage(dr);
		
		page1.login(username, password);
		dr.quit();
		
		
	}
	
	
	@DataProvider
	public String[][] getdata2() throws IOException
	{
		Xls_Reader obj = new Xls_Reader(Config.testdata);
	     
	      
	      int rows = obj.getrowcount("TestData");
	      int cols = obj.getColumncount("TestData");
	      
	      String[][] data = new String[rows-1][cols];
	      
	      for(int r=2;r<=rows;r++)
	      {
	    	  for(int c=1;c<=cols;c++)
	    	  {
	    		  data[r-2][c-1]=obj.getCellData("TestData", r, c);
	    	  }
	      }
	      
	      return data;
		
	}


}
