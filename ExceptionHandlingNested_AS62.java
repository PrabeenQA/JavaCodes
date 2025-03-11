package JavaClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

//Assignment - 62 - WAP on Exception handling using nested try catch keywords.
public class ExceptionHandlingNested_AS62 {

	public static void main(String[] args) {
		try {									//Exception should be in the try block
		Scanner s1 = new Scanner(System.in);	//Import Scanner class from java.util
		System.out.println("Enter your age");
		int age = s1.nextInt();
		try {
			System.out.println("Enter the 1st number");
			int temp = s1.nextInt();
			System.out.println("Enter the 2nd number");
			int i =temp/s1.nextInt();
			System.out.println("Result =" +i);
			
		}
		catch(ArithmeticException m2){
			System.out.println("This is 1st try catch");
		}
		}
		catch(InputMismatchException m1) {		//Handle should be in the catch block	// Exception with a reference variable
			Scanner s1 = new Scanner(System.in);	//Import the occurred exception class from java.util
			System.out.println("Your age shuld be numbers only");
			int age = s1.nextInt();
		}
		
	}

}
