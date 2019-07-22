package basicAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suite1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite 1");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite 1");
	}

}
