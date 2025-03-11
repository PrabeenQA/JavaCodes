package JavaClasses;

////Assignment - 64 - WAP on finally keyword concept.
public class FinalyBlock_AS64 {

	public static void main(String[] args) {
		
		try{
			int a = 1/1;
		}
		catch(ArithmeticException a1){
			System.out.println("Catch block");
		}
		finally{
			System.out.println("Finally block");
		}

	}

}
