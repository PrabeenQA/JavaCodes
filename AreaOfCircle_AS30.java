package JavaClasses;
import java.util.Scanner;			
//Assignment-30 - WAP to print Area of Circle using Scanner Class.
public class AreaOfCircle_AS30 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	//Scanner object to read input
		System.out.println("Enter the radius of the circle");		//user input to radius
		double radius =s1.nextDouble();
		double area = Math.PI *radius *radius;		//Calculate the area of the circle
		System.out.println("The area of circle is " +area);
		s1.close();		// Close the scanner
		
	}

}