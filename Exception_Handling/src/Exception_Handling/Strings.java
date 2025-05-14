package Exception_Handling;

public class Strings {
	public static void execution4()
	{
		String str="java";
		try
		{
			for(int i=0;i<=str.length();i++)
			{
				System.out.println(str.charAt(i));
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exceedig the limitations of String");
			System.out.println("Exception handled");
		}
	}
}
