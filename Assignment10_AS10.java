package JavaClasses;

public class Assignment10_AS10 {

	//Assignment -10 - WAP to check person can vote only if he/she is 18 or above and should not vote if age is less.
	public static void main(String[] args) {
		int age = 17;
		int agelimit = 18;
		if (age == agelimit || age > agelimit) 
		{
			System.out.println("Person is eligible for vote");
		} 
		else 
		{
			System.out.println("Person is not eligible for vote");
		}

	}

}
