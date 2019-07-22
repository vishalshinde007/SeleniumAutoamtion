package basicAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test2 {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test 2");
	}
	
	@AfterTest
	public void afterTest2()
	{
		System.out.println("After Test 2");
	}

}
