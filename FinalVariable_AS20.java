package JavaClasses;

//Assignment -20- WAP on Final variable.
public class FinalVariable_AS20 {
	
	final static double pi=3.14;
	static void areaofcercle()
	{
		final double pi=3.14;
		int redius=7;
		//pi=7;		//Not allowed
		double area=pi*redius*redius;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		areaofcercle();
		double pi=5;	//Local variable different than the Global variable that is final
		System.out.println(pi);
	}

}
