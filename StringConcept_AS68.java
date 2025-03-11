package JavaClasses;

//Assignment -68 - Wap on String Function using concat and contains concept.
public class StringConcept_AS68 {

	public static void main(String[] args) {
		String a1= "good boy";
		System.out.println(("Prabeen is a ").concat(a1));		//Concatenate
		
		String a3= "is";
		String a2= "Java";
		String a4= "good";
		System.out.println(a2.concat(" ").concat(a3).concat(" ").concat(a4));
		
		String name = "Prabeen Kumar Sahoo";
		boolean b1= name.contains("Kumar");		//checking sequence of the characters present in the string or not
		boolean b2= name.contains("Yadav");
		System.out.println(b1);
		System.out.println(b2);
	}

}
