package JavaClasses;

//Assignment -70 - WAP to reverse a string.
public class ReverseAString_AS70 {

	public static void main(String[] args) {
		String name = "Prabeen";
		String reverse = ""; // temp variable to store later
		for (int i = name.length() - 1; i >= 0; i--) {
			char a = name.charAt(i); // take the value of 'i' and store it in 'a' variable
			reverse = reverse + a;		//reverse is empty - empty+i value
		}
		System.out.println(reverse);

	}

}
