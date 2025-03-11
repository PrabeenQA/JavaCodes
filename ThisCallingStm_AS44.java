package JavaClasses;

//Assignment - 44 - WAP on this calling statement.
public class ThisCallingStm_AS44 
{
	ThisCallingStm_AS44 ()			//1st Constructor
	{
		this("Hello");			//Calling 2nd Constructor
		System.out.println("1");
	}
	ThisCallingStm_AS44 (String s)			//2nd Constructor
	{
		this('c');			//Calling 3rd Constructor
		System.out.println("2");
	}
	ThisCallingStm_AS44 (char c)			//3rd Constructor
	{
		System.out.println("3");
	}

	public static void main(String[] args) {
		
		new ThisCallingStm_AS44();
		
	}

}
