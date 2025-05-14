package Array_swapping;


public interface Main {
	public static void main(String[] args)
	{
		int[]arr= {1,2,3,4,5,6,7};
		int k=3;
		for(int j=1;j<=k;j++)
		{
			//int temp=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i+1]=arr[i];
				System.out.println(arr[i+1]);
			}
			arr[0]=arr[arr.length-1];
			//System.out.println(arr[0]);
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
	}
}
