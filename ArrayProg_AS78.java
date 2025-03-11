package JavaClasses;

import java.util.Arrays;

//Assignment -78 - WAP to copy one array into another array.
public class ArrayProg_AS78 {

	public static void main(String[] args) {
		 int array1[] = new int[4];
		 array1[0]=45;
		 array1[1]=27;
		 array1[2]=30;
		 array1[3]=42;
		 
		 int array2[]= new int[array1.length];
		 for(int i=0; i<=array1.length-1; i++) {
			 array2[i]=array1[i];
		 }
		 System.out.println("Onput array " +Arrays.toString(array1));
		 System.out.println("Coppied array " +Arrays.toString(array2));

		 
		 
		}
	}

