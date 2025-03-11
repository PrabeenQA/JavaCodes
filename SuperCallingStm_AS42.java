package JavaClasses;

//Assignment - 42 - WAP on super calling statement using non-parameterized super calling statement.
class Amazon1
{
	Amazon1()		//Parent class Constructor
	{
		System.out.println("This is Parent class Constructor");
	}
}
public class SuperCallingStm_AS42 extends Amazon1
{
	SuperCallingStm_AS42()		//Child class Constructor
	{
		super();		//Super calling statement	//No need to write bydefult it is present
		System.out.println("This is Child class Constructor");
	}

	public static void main(String[] args) {
		new SuperCallingStm_AS42();		//creating and calling object
		
		//Here bydefult it will call the parent class constructor 
		
	}

}
