package JavaClasses;

//Assignment -67 - Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts.
public class StringConcept_AS67 {

	public static void main(String[] args) {
		String a= "good boy";
		String b= "PRABEEN";
		System.out.println(b.toLowerCase());	//convert to lower case
		System.out.println(a.toUpperCase());	//convert to upper case
		
		int a1=a.length();			//length of the string
		System.out.println("The length is "+a1);	
		
		String c = "Akanksha";
		System.out.println(c.charAt(0));		//character present in the index of 0
		System.out.println(c.charAt(3));
		
		String d = "    I am a good boy    ";
		System.out.println(d);
		System.out.println(d.trim());		//remove the space
		
	}

}
