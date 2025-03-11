package JavaClasses;

//Assignment-12- WAP to call non 3 non static methods in the main method
public class NonStaticMethod_AS12 {
	void add()		//NonStaticMethod
	{
		int a=10;
		int b=2;
		System.out.println(a+b);
	}
	void sub()		//NonStaticMethod
	{
		int a=10;
		int b=2;
		System.out.println(a-b);
	}
	
	void mul()		//NonStaticMethod
	{
		int a=10;
		int b=2;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		NonStaticMethod_AS12 n = new NonStaticMethod_AS12();
		n.add();
		n.sub();
		n.mul();
	}

}
