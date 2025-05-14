package Array_swapping;

public interface Array {
	public static Integer[] swap(Integer[]a)
	{
		if(a.length>=1)
		{
			int temp=a[0];
			a[0]=a[(a.length)-1];
			a[(a.length)-1]=temp;
			return a;
		}
		return null;
	}
}
