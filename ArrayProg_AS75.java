package JavaClasses;

//Assignment -75 - Find out the average of all the numbers present in your array.

public class ArrayProg_AS75 {

	public static void main(String[] args) {
		int[] age = new int[4];
		age[0]=45;
		age[1]=27;
		age[2]=21;
		age[3]=31;
		
		int sum=0;
		double average=0;
		
		for(int i=0; i<=age.length-1; i++) {
			sum=sum+age[i];
		}
		
		average=sum/age.length;
		System.out.println(average);
	}

}
