package JavaClasses;

import java.util.Scanner;

//Assignment - 36 - WAP to print Area of Rectangle using Scanner Class.
public class AreaOfRectangle_AS36 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	
		System.out.println("Enter the length of the rectangle: ");	
		double length = s1.nextDouble();
		System.out.println("Enter the width of the rectangle: ");	
		double width = s1.nextDouble();
		double area = length*width;		//Formula of area of the rectangle
		System.out.println("The Area of Rectangle is: " + area);
		s1.close();
	}

}
