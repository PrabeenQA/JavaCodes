package JavaClasses;

//Assignment - 47 - WAP on This Keyword.
public class ThisKeyword_AS47 
{
	String name1;
	double salary1;
	int age1;
	void Student_Details(String name,double salary,int age)
	{
		this.name1=name;		//Global variable = Local variable
		this.salary1=salary;
		this.age1=age;
		System.out.println("My name is : " +name);
		System.out.println("My salary is : " +salary);
		System.out.println("My age is : " +age);
	}

	public static void main(String[] args) {
		ThisKeyword_AS47 g1 = new ThisKeyword_AS47();
		g1.Student_Details("Prabeen", 10000, 25);
		System.out.println(g1.name1);
		System.out.println(g1.salary1);
		System.out.println(g1.age1);

	}

}
