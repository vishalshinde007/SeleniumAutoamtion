package exceptionhandling;

import oopsinterface.RBI;

public class ExceptionHandlingClass3 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//abnormal behavior of code is known as exception
		
		try
		{
		//type 1 exception
		int a=10;
		int b=10;
		System.out.println(a/b);
		
		RBI obj = null;
		//obj.creditcard();
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		System.out.println("anand");
		//Exception Type2 : Check Exception
		Thread.sleep(3000);
		System.out.println("bhayre");
		Test.login();
		}catch(ArithmeticException e)
		{
			
			System.out.println("Divident is zero");
			
		}catch(NullPointerException e)
		{
			System.out.println("RBI reference is not initialized");
			
			//All exception can be handled with this catch block
		}
		/*catch(Exception e)
		{
			System.out.println(e.getMessage());
		}*/
		
		//Runtime exception can be handled with this catch block
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Step 2");

	}


}
