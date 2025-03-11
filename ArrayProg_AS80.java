package JavaClasses;

//Assignment -80 - WAP on Array Function using Arrays.toString and Arrays.sort concept.
import java.util.Arrays;

public class ArrayProg_AS80 {

	public static void main(String[] args) {
		int[] age = new int[4];
		age[0]=45;
		age[1]=27;
		age[2]=21;
		age[3]=31;
		
		Arrays.sort(age);		//sort the elements
		System.out.println(Arrays.toString(age));		//convert to String
		
		
	}

}
