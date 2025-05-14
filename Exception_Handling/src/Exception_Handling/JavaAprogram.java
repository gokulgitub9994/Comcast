package Exception_Handling;

public class JavaAprogram {
	public static void execution()
	{
		int i=10;
		System.out.println(i);
		int j=0;
		System.out.println(j);
		try {
		int k=i/j;
		System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			java.util.Scanner scan=new java.util.Scanner(System.in);
			j=scan.nextInt();
			scan.close();
			if(j!=0)
			{
				int k = i/j;
				System.out.println(k);
			}
			else {
			System.out.println("Undefined");
			}
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		String str1=null;
		try
		{
			System.out.println(str1+" "+str1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("can't perform any operations using on null");
			System.out.println("Exception Handled");
	}
		finally
		{
			System.out.println("Finally Block");
		}

	}
}
