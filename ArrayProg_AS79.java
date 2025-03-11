package JavaClasses;

import java.util.Arrays;

//Assignment -79 - WAP to copy one array into another array in reverse order.
public class ArrayProg_AS79 {

	public static void main(String[] args) {
		 int array1[] = new int[4];
		 array1[0]=45;
		 array1[1]=27;
		 array1[2]=30;
		 array1[3]=42;
		 
		 int reverse[]= new int[array1.length];
		 for(int i=0,j=array1.length-1; i<=array1.length-1; i++) {
			 reverse[j]=array1[i];
			 j--;
		 }
		 System.out.println("Input array " +Arrays.toString(array1));
		 System.out.println("Reversed array " +Arrays.toString(reverse));

		 
		 
		}
	}

