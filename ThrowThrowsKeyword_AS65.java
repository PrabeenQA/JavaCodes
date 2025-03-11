package JavaClasses;

//Assignment - 65 - WAP to terminate any program using Throw keyword.
public class ThrowThrowsKeyword_AS65 {

	public static void main(String[] args) throws NullPointerException {
		
		try {
            throw new NullPointerException("Program terminated intentionally.");
        } 
		catch (Exception e) {
            System.out.println("Caught exception: It will be handeld");
        }

	}

}
