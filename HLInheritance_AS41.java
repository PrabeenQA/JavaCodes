package JavaClasses;

//Assignment- 41- WAP on Hierarchical Level Inheritance.

class HLI_1
{
	static void launch_browser()
	{
		System.out.println("Brouser Launched");
	}
}
class HLI_2 extends HLI_1
{
	static void login_logout()
	{
		System.out.println("Login and Logout");
	}
}


public class HLInheritance_AS41 extends HLI_1
{
		static void Register_Login()
		{
			System.out.println("Register and Login");
		}
	public static void main(String[] args) {
		launch_browser();
		Register_Login();		
	}

}
