package JavaClasses;

//Assignment-16 - WAP for Method overloading for static and non static method.
public class MethodOverloading_16 {
	static void add(int a,int b)		//static method with parameter
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void add(String name)				//non-static method with different parameter
	{
		System.out.println("Hello");
	}
	static void add(int a,double d, char c,String name)		//static method
	{
		System.out.println("World");
	}
	
	public static void main(String[] args) {
	MethodOverloading_16 n = new MethodOverloading_16();
	n.add("Prabeen");		//call non static method with ref variable
	add(20,30);				//direct calling with method name
	add(20, 2.3, 'P', "Prabeen");
	}

}
