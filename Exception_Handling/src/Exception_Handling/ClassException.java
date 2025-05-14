package Exception_Handling;

public class ClassException {
	public static void execution2()
	{
		Object o=new A();
		try {
		B b=(B)o;
		}
		catch(ClassCastException e)
		{
			System.out.println("Downcasting hasn't been done");
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Finally");
		}
		
	}
}
