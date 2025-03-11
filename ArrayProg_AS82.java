package JavaClasses;

//Assignment -82 - WAP to find out if the given 2 strings are anagram.
import java.util.Arrays;

public class ArrayProg_AS82 {

	public static void main(String[] args) {
		String s1 ="cat";
		String s2 = "act";
		
		if(s1.length()!=s2.length()) {
			System.out.println("It is not Enagram");
		}else
		{
			char c1[]= s1.toCharArray();	//[C,a,t]
			char c2[]= s2.toCharArray();	//[A,c,t]
			
			Arrays.sort(c1);	//[a,C,t]
			Arrays.sort(c2);	//[A,c,t]
			
			boolean b1 = Arrays.equals(c1, c2);
			if(b1==true) {
				System.out.println("It is Enagram");
			}else
			{
				System.out.println("It is not Enagram");
			}
		}
		
	}

}
