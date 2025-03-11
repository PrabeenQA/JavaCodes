package JavaClasses;

//Assignment - 39 - WAP on Single Level Inheritance.
class D
{
	static void one()
	{
		System.out.println("One");
	}
}
public class SingleLevelInheritance_AS39 extends D
{
	 void three()
	{
		System.out.println("Three");
	}

	public static void main(String[] args) {
		
		SingleLevelInheritance_AS39 s1 = new SingleLevelInheritance_AS39();
		one();
		s1.three();
		
	}

}
