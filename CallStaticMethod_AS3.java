package JavaClasses;

public class CallStaticMethod_AS3 {
	
	//Assignment - 3 - Call Static Methods inside the main method
	
	static void add()			// static method inside the class
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void sub()
	{
		int c = 30;
		int d = 25;
		int e = c-d;
		System.out.println(e);
	}
	
	static void mul()
	{
	int x = 10;
	int y = 2;
	int z = x*y;
	System.out.println(z);
	}
	public static void main(String[] args) {
		add();			//Direct call the method if in the same class
		sub();
		mul();
	}

}
