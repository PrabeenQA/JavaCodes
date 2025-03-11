package JavaClasses;

//Assignment -72 - WAP on basic concepts of Array.
public class ArrayProg_AS72 {

	public static void main(String[] args) {
		int rollno[] = new int[3];
		rollno[0]=57;
		rollno[1]=58;
		rollno[2]=59;
		//rollno[3]=59;		//ArrayIndexOutOfBoundsException - As it is out of the boundries
		
		String name[] = new String[3];
		name[0]="Ram";
		name[1]="Sham";
		name[2]="Ravi";
		
		for(int i=0; i<=2; i++) {
			System.out.println(rollno[i]);
			System.out.println(name[i]);
		}
		
	}

}
