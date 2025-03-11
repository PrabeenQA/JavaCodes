package JavaClasses;

//Assignment-49 - WAP on Abstract Class and Abstract Method.
abstract class Program2 { // abstract class
	abstract void add(); // abstract method no implementation
	abstract void sub(); // abstract method
}

public class AbstractClass_AS49 extends Program2 {

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