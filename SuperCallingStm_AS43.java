package JavaClasses;

//Assignment - 43 - WAP on super calling statement using parameterized super calling statement.
class Amazon3
{
	Amazon3()		//Grand Parent class Constructor with no Para
	{
		//super();		//Super calling statement by defult no need to call
		System.out.println("This is Grand Parent class Constructor");
	}
}
class Amazon2 extends Amazon3
{
	Amazon2(String UN,String PSD)		//Parent class Constructor with Para
	{
		System.out.println("This is Parent class Constructor");
	}
}
public class SuperCallingStm_AS43 extends Amazon2
{
	SuperCallingStm_AS43()		//Child class Constructor
	{
		super("username","password");		//Need to mention with parameter
		System.out.println("This is Child class Constructor");
	}

	public static void main(String[] args) {
		new SuperCallingStm_AS43();		//creating and calling object
		
	}

}
