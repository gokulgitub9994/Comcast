package MultipleException;

public class JavaProgram {
	public static void execution1()
	{
//		int[] arr=new int[] {1,2,3};
//		String s="java";
//		try
//		{
//			for(int i=0;i<=arr.length;i++)
//			{
//				System.out.println(arr[i]);
//			}
//			for(int i=0;i<=s.length();i++)
//			{
//				System.out.println(s.charAt(i));
//			}
//		}
//		catch(Throwable e)
//		{
//			e.printStackTrace();
//			System.out.println("Exception Handled");
//		}
		
		java.util.Scanner scan=new java.util.Scanner(System.in);
		 try
		 {
			 System.out.println("Enter 1st number");
			 int i=scan.nextInt();
			 System.out.println("Enter 2nd number");
			 int j=scan.nextInt();
			 int k=i/j;
			 System.out.println(k);
		 }
		 catch(Throwable e)
		 {
			 e.printStackTrace();
			 System.out.println("Exception Handled");
		 }
		finally
		 {
			 scan.close();
			 System.out.println("resourse closed");
		 }
	}
}
