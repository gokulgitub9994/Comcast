package Exception_Handling;

public class Arrays {
	public static void execution3()
	{
//		int[] arr=new int[] {1,2,3};
//		try
//		{
//			for(int i=0;i<=arr.length;i++)
//			{
//				System.out.println(arr[i]);
//			}
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Exceeding the limitations of array");
//			System.out.println("Exception handled");
//		}
//		finally
//		{
//			System.out.println("finally handled");
//		}
		try
		{
			int [] array=new int[1000*1000*1000];
			System.out.println(array);
		}
		catch(OutOfMemoryError e)
		{
			System.out.println("Exceeding the Heap Area Capacity");
		}
	}
}
