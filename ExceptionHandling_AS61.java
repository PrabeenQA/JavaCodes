package JavaClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

//Assignment - 61 - WAP on Exception handling.
public class ExceptionHandling_AS61 {

	public static void main(String[] args) {
		try {									//Exception should be in the try block
		Scanner s1 = new Scanner(System.in);	//Import Scanner class from java.util
		System.out.println("Enter your age");
		int age = s1.nextInt();
		}
		catch(InputMismatchException m1) {		//Handle should be in the catch block	// Exception with a reference variable
			Scanner s1 = new Scanner(System.in);	//Import the occurred exception class from java.util
			System.out.println("Your age shuld be numbers only");
			int age = s1.nextInt();
		}
		
	}

}
