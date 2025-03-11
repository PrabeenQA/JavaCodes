package JavaClasses;

//Assignment-22 - WAP to update static and non static global variable
public class Assignment_AS22 {

	static double b=12.2;		//Static Global Variable
	int a=10;				//Non-static Global Variable
	
	public static void main(String[] args) {
		Assignment_AS22 n1 =new Assignment_AS22();
		n1.a=20;					//Update not static global variable
		System.out.println("Updated value of 'a' is " +n1.a);
		b=25.2;						//Update static global variable
		System.out.println("Updated value of 'b' is " +b);
		

	}

}
