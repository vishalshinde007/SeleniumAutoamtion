package functions;

public class Car
{
	String name;
	String colour;
	static int wheels=4;
	
	//non static functions (we have to create object of class)
	public void driving()
	{
		System.out.println("I am driving "+colour+" colour "+name+" which has "+wheels+" wheels");
	}

}
