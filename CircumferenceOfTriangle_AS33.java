package JavaClasses;

import java.util.Scanner;

//Assignment - 33 - WAP to print Circumference of Triangle using Scanner Class.
public class CircumferenceOfTriangle_AS33 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Enter the first side of the triangle :");	
		double a = s1.nextDouble();
		System.out.println("Enter the second side of the triangle: ");		
		double b =s1.nextDouble();
		System.out.println("Enter the third side of the triangle: ");		
		double c =s1.nextDouble();
		double circumference = a+b+c;		//Formula of Circumference Of Triangle
		System.out.println("The circumference of the triangle is: " + circumference);
		s1.close();

	}

}
