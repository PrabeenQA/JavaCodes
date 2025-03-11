package JavaClasses;

//Assignment-13- WAP with combination of static and non static methods and try calling both of them
public class StaticAndNonStaticMethod_AS13 {
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
	
	static void mul()		//StaticMethod
	{
		int a=10;
		int b=2;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		StaticAndNonStaticMethod_AS13 n = new StaticAndNonStaticMethod_AS13();
		n.add();		//Calling non static method with ref variable
		n.sub();		//Calling non static method with ref variable
		mul();			//Calling static method directl
	}

}
