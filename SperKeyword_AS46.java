package JavaClasses;

//Assignment - 46 - WAP on Super Keyword.
	class Google_Auth1
	{
		void login(String NU, String PSD)
		{
			System.out.println("Login with Mobile No.");
		}
	}

public class SperKeyword_AS46 extends Google_Auth1
{
		void login(String NU, String PSD)
		{
			System.out.println("Login with Email Id");
			super.login("Prabeen", "Password");
		}
	public static void main(String[] args) {
		SperKeyword_AS46 m1 = new SperKeyword_AS46();
		m1.login("Prabeen", "Password");
	}

}
