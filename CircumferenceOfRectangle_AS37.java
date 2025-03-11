package JavaClasses;

import java.util.Scanner;

//Assignment - 37 - WAP to print Circumference of Rectangle using Scanner Class.
public class CircumferenceOfRectangle_AS37 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Enter the length of the rectangle: ");	
		double length = s1.nextDouble();
		System.out.println("Enter the width of the rectangle: ");	
		double width = s1.nextDouble();
		double area = 2*(length+width);		//Formula of area of the rectangle
		System.out.println("Circumference of Rectangle is: " + area);
		s1.close();
	}

}
