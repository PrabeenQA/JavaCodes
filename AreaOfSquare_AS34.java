package JavaClasses;

import java.util.Scanner;

//Assignment - 34 - WAP to print Area of Square using Scanner Class.
public class AreaOfSquare_AS34 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Enter the side length of the square: ");	
		double side = s1.nextDouble();
		double area = side*side;		//Formula of area of the square
		System.out.println("The area of the square is: " + area);
		s1.close();
	}

}
