package JavaClasses;

//Assignment-53 - WAP on Multiple Level Inheritance.
interface Amazon8 {
	 void add(); 
	 void sub(); 
}

interface Amazon9  {
	void mul(); 
	void div(); 
}

public class MLInterface_AS53 implements Amazon9,Amazon8 {

	public static void main(String[] args) {
	}

	@Override
	public void add() {
		System.out.println("Logic to hide");
	}

	@Override
	public void sub() {
		System.out.println("Logic to hide");
	}

	@Override
	public void mul() {
		System.out.println("Logic to hide");
	}

	@Override
	public void div() {
		System.out.println("Logic to hide");
	}

}