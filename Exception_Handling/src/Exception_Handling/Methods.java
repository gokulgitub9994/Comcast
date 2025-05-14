package Exception_Handling;

public class Methods {
	public static void execution6()
	{
		System.out.println("static execution");
		try {
		demo();
		}
		catch(StackOverflowError e)
		{
			System.out.println("calling the method itself");
			System.out.println("Exception handled");
		}
	}
	public static void demo()
	{
		System.out.println("demo execution");
		demo();
	}
}
