package JavaClasses;

public class LogicalOperators_AS9 {
	//Assignment -9 - WAP on logical operators with AND, OR, AND-NOT and Or-not.
	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		//Using AND && Operator
		if(a==100 && b>a)		// T - T = T
		{
			System.out.println("Block Execute");
		}
		
		//Using OR || Operator
		if(a==b || b>a) 		// F - T = T
		{
			System.out.println("Execute");
		}
		
		//Using AND with NOT Operator
		if(!(a==100 && b>a))		// (!(T - T= T)) = F
		{
			System.out.println("Not Execute");
		}
				
		//Using OR with NOT Operator
		if(!(a==b || b<a)) 		// (!(F - F = F))= T
		{
			System.out.println("It will Execute");
		}
	}

}
