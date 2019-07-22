package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test1 {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test 1");
	}
	
	@AfterTest
	public void afterTest2()
	{
		System.out.println("After Test 1");
	}

}
