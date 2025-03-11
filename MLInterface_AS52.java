package JavaClasses;

//Assignment-52 - WAP on Multi Level Inheritance using Interface Concept.
interface Amazon6 {
	 void add(); 
	 void sub(); 
}

interface Amazon7 extends Amazon6 {
	void mul(); 
	void div(); 
}

public class MLInterface_AS52 implements Amazon7 {

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