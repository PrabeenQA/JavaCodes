package JavaClasses;

//Assignment-18- WAP to declare a Global variable.
public class GlobalVariable_AS18 {
	
	int a=10;		//Global non-static var
	static double d=9.1;		//Global static var
	public static void main(String[] args) {
		GlobalVariable_AS18 g = new GlobalVariable_AS18();
		g.a=100;	//Call by object reference and update the value to 100
		System.out.println("Update value of a is " +g.a);
		d=9.5;		//Direct calling and update the value to 9.5
		System.out.println("Update value of d is " +d);
		
	}

}
