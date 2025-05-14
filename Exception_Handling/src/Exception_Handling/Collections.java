package Exception_Handling;

import java.util.ArrayList;

public class Collections {
	public static void execution5()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			al.add(i);
		}
		try {
			for(int i=0;i<=al.size();i++)
			{
				System.out.println(al.get(i));
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exceeding the limitation of ArrayList");
		}
	}
}
