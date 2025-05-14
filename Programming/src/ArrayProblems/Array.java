package ArrayProblems;

public interface Array {
	public static boolean display(Integer[] arr)
	{  
		int flag=0;
		int flag1=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]==2)&&(arr[i+1]==2))
			{
				flag=1;
			}
			else if((arr[i]==4)&&arr[i+1]==4)
			{
				flag1=2;
			}
			
		}
		if((flag==1)&&(flag1==2))
		{
			return false;
		}
		else if(flag==1)
		{
			return true;
		}
		else if(flag1==2)
		{
			return true;
		}
		else {
		return false;
		}
		
	}
}
