package JavaClasses;

import java.util.Arrays;
import java.util.Scanner;

//Assignment -77 - WAP to check if 2 arrays are equals to each other at run time.
public class ArrayProg_AS77 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of the 1st array");
		int array1[] = new int[s1.nextInt()];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter the value of the 1st array");
			array1[i] = s1.nextInt();
		}

		System.out.println("Please enter the size of the 2nd array");
		int array2[] = new int[s1.nextInt()];

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Enter the value of the 2nd array");
			array2[i] = s1.nextInt();
		}
			boolean b1 = Arrays.equals(array1, array2);
			
			if(b1) {
				System.out.println("The arrays are equal");
			} else
			{
				System.out.println("The arrays are not equal");
			}
		}
	}

