package JavaClasses;

//Assignment-19- WAP on Constructor Overloading
public class ConstructorDemo_AS19 {
	
	ConstructorDemo_AS19()		//Non-para Constructor	//name should be same as class name //non-static only
	{
		System.out.println("1st Constructor");
	}
	ConstructorDemo_AS19(int a)		//Parameterized Constructor	//Overloading Constructor
	{
		System.out.println("2nd Constructor");
	}
	public static void main(String[] args) {
		new ConstructorDemo_AS19();		//creating object by new+classname
		new ConstructorDemo_AS19(30);
	}

}
