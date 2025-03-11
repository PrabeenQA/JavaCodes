package JavaClasses;

import java.util.Scanner;

//Assignment -76 - WAP to accept the values of your array at run time.
public class ArrayProg_AS76 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int age[]=new int[s1.nextInt()];
		
		for(int i=0; i<age.length; i++) {
			System.out.println("Enter the value of the index");
			age[i]=s1.nextInt();
			}
	}

}
