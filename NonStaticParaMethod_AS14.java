package JavaClasses;

//Assignment-14- WAP with combination of 4 non static parameterized methods and try calling all of them
public class NonStaticParaMethod_AS14 {

	void add(int a, int b)
	{
	int sum=a+b;
	System.out.println(sum);
	}
	void sub(boolean b, double d)
	{
		System.out.println("Substraction");
	}
	
	void mul(char c)
	{
		System.out.println("Multiplication");
	}
	void div(String name)
	{
		System.out.println("Division");
	}
	
	public static void main(String[] args) {
		NonStaticParaMethod_AS14 r = new NonStaticParaMethod_AS14();
		r.add(20, 30);
		r.sub(false, 3.2);
		r.mul('P');
		r.div("Prabeen");
		
	}

}
