package JavaClasses;

import java.util.Scanner;

//Assignment - 32 - WAP to print Area of Triangle using Scanner Class.
public class AreaOfTriangle_AS32 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	//Scanner object to read input
		System.out.println("Enter the base of the triangle");		//user input of base 
		double base =s1.nextDouble();
		System.out.println("Enter the height of the triangle");		//user input of height 
		double height =s1.nextDouble();
		double area = 0.5*base*height;		//Formula of area of the triangle
		System.out.println("The area of the triangle is: " + area);
		s1.close();

	}

}
