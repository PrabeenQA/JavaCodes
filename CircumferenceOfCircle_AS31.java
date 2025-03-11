package JavaClasses;

import java.util.Scanner;

//Assignment -31 - WAP to print Circumference of Circle using Scanner Class.
public class CircumferenceOfCircle_AS31 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	//Scanner object to read input
		System.out.println("Enter the radius of the circle");		//user input to radius
		double radius =s1.nextDouble();
		double circumference = 2* Math.PI *radius;		//Calculate the circumference of the circle
		System.out.println("The circumference of circle is " +circumference);
		s1.close();
		
	}

}
