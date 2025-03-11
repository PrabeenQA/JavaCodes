package JavaClasses;

import java.util.Scanner;

//Assignment - 35 - WAP to print Circumference of Square using Scanner Class.
public class CircumferenceOfSquare_AS35 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Enter the side length of the square: ");	
		double side = s1.nextDouble();
		double circumference = 4*side;		//Formula of Circumference of Square
		System.out.println("The Circumference of Square is: " + circumference);
		s1.close();
	}

}
