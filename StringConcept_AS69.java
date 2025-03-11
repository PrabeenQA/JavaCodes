package JavaClasses;

//Assignment -69 - WAP on String Function using equals and equalsIgnoreCase concept.
public class StringConcept_AS69 {

	public static void main(String[] args) {
		String name = "Prabeen";
		boolean b1 = name.equals("prabeen"); // check it equal or not
		boolean b2 = name.equalsIgnoreCase("PRABEEN"); // check it and ignore the case sensitivity
		System.out.println(b1);
		System.out.println(b2);

	}

}
