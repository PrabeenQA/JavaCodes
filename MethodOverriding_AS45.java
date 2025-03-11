package JavaClasses;

//Assignment - 45 - WAP on method overriding.
	class Google_Auth
	{
		void login()
		{
			System.out.println("Login with Mobile No.");
		}
	}

public class MethodOverriding_AS45 extends Google_Auth
{
		void login()
		{
			System.out.println("Login with Email Id");
			super.login();
		}
	public static void main(String[] args) {
		MethodOverriding_AS45 m1 = new MethodOverriding_AS45();
		m1.login();
	}

}
