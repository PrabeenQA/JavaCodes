package JavaClasses;

//Assignment-21 - WAP for static and non static global variables and utilize them in both static and non static methods
public class Assignment_AS21 {

	static double d=12.2;		//Static Global Variable
	int a=10;				//Non-static Global Variable
	
	static void add()		//Static method
	{
		Assignment_AS21 n1=new Assignment_AS21();
		double addition=n1.a+d;		//Utilize both static and non static global variables here
		System.out.println(addition);
		
	}
	void sub()			//Non-static method
	{
		Assignment_AS21 n2=new Assignment_AS21();
		double substract=d-n2.a;		//Utilize both static and non static global variables here
		System.out.println(substract);
	}
	
	public static void main(String[] args) {
		Assignment_AS21 result =new Assignment_AS21();
		result.sub();
		add();

	}

}
