package JavaClasses;

//Assignment-60- WAP on SIB and IIB.
public class SIB_program_AS60 {
	
	static {
		System.out.println("SIB 1");
	}
	static {
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		new SIB_program_AS60();		//create object of class to call the IIB
		

	}

}
