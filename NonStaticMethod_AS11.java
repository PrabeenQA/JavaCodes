package JavaClasses;

//Assignment-11- WAP to call one non static method in the main method
public class NonStaticMethod_AS11 {
	void add()		//NonStaticMethod
	{
		int a=10;
		int b=2;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		NonStaticMethod_AS11 n = new NonStaticMethod_AS11();
		n.add();
	}

}
