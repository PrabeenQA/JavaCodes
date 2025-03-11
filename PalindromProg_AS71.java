package JavaClasses;

//Assignment -71 - WAP to check if the given string is a Palindrom?
public class PalindromProg_AS71 {

	public static void main(String[] args) {
		String name = "Mom";
		String reverse = ""; // temp variable to store later
		for (int i = name.length() - 1; i >= 0; i--) {
			char a = name.charAt(i); // take the value of 'i' and store it in 'a' variable
			reverse = reverse + a; // reverse is empty - empty+i value
		}
		if (name.equals(reverse)) {
			System.out.println("It is Palindrom");
		}
		else {
			System.out.println("It is not Palindrom");
		}
	}

}
