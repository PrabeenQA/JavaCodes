package JavaClasses;

//Assignment -83 - WAP to count the number of alphabets, numeric letters,spaces and special characters used in the given String.
import java.util.Arrays;

public class ArrayProg_AS83 {

	public static void main(String[] args) {
		String s1 = "kv no 2";
		char[] c1 = s1.toCharArray();
		int alphabetcount = 0;
		int digitcount = 0;
		int spacecount = 0;

		for (int i = 0; i <= c1.length - 1; i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			if (b1 == true) {
				alphabetcount++;
			}
			if (b2 == true) {
				digitcount++;
			}
			if (b3 == true) {
				spacecount++;
			}

		}
		int specialchar=s1.length()-(alphabetcount+digitcount+spacecount);
		System.out.println("Count of alphabets =" + alphabetcount);
		System.out.println("Count of digits =" + digitcount);
		System.out.println("Count of spaces =" + spacecount);
		System.out.println("Count of special characters =" + specialchar);
	}

}
