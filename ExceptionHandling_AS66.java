package JavaClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

//Assignment - 66 - WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario.
public class ExceptionHandling_AS66 {

	public static void main(String[] args) {
		try {									
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Plese enter the size of an array");		//We can provide any invalid input like - -10 0r Prabeen
		int age = s1.nextInt();
		}
		catch(Exception m1) {		//Instead of a particular exception we can give the Exception class directly that can handle all type of exception
			Scanner s1 = new Scanner(System.in);	
			System.out.println("It will accept any input");
			int age = s1.nextInt();
		}
		
	}

}
