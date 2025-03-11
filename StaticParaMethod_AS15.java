package JavaClasses;

//Assignment-15- WAP with combination of 3 static parameterized methods and try calling all of them.
public class StaticParaMethod_AS15 {
	
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void student(String name)
	{
		System.out.println("Hello");
	}
	static void info(int a,double d, char c,String name)
	{
		System.out.println("World");
	}
	
	public static void main(String[] args) {
		add(50, 100);
		student("Prabeen");
		info(40, 3.2, 'P', "Akku");
	}

}
