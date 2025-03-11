package JavaClasses;
//Assignment-50 - WAP on Abstract Class with both Abstract and Concrete methods.
abstract class Program1 { // abstract class
	abstract void add(); // abstract method no implementation

	abstract void sub(); // abstract method

	void login() // Concrete method
	{
		System.out.println("Logic to Expose login method");
	}

	static void logout() // Concrete method
	{
		System.out.println("Logic to Expose logout method");
	}
}

public class AbstractClass_AS50 extends Program1 {

	@Override
	void add() {
		System.out.println("Logic to not expose");
	}

	@Override
	void sub() {
		System.out.println("Logic to not expose");
	}

	public static void main(String[] args) {

	}

}