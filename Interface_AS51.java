package JavaClasses;
//Assignment-51 - WAP on Interface with 2 Abstract methods.
interface Amazon5
{
	void add(); // abstract method no implementation
	void sub(); // abstract method
}

public class Interface_AS51 implements Amazon5 {

	public static void main(String[] args) {

	}

	@Override
	public void add() {
		System.out.println("Logic to not expose");	
	}

	@Override
	public void sub() {
		System.out.println("Logic to not expose");		
	}

}