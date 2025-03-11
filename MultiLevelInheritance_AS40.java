package JavaClasses;

//Assignment - 40 - WAP on Multi Level Inheritance.
class C
{
	static void one()
	{
		System.out.println("One");
	}
}
class B extends C
{
	void two()
	{
		System.out.println("Two");
	}
}
public class MultiLevelInheritance_AS40 extends B
{
	static void three()
	{
		System.out.println("Three");
	}

	public static void main(String[] args) {
		
		MultiLevelInheritance_AS40 s1 = new MultiLevelInheritance_AS40();
		one();
		s1.two();
		three();
		
	}

}
