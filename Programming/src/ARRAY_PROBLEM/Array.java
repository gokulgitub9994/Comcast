package ARRAY_PROBLEM;

public interface Array {
	public static Integer[] add(Integer[]a,Integer[]b)
	{
		if(a.length==b.length)
		{
			Integer[]c=new Integer[a.length];
			for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			}
			return c;
		}
		return null;
	}
	public static Integer[] sub(Integer[]a,Integer[]b)
	{
		if(a.length==b.length)
		{
			Integer[]c=new Integer[a.length];
			for(int i=0;i<a.length;i++) {
			c[i]=a[i]-b[i];
			}
			return c;
		}
		return null;
	}
	public static Integer[] mul(Integer[]a,Integer[]b)
	{
		if(a.length==b.length)
		{
			Integer[]c=new Integer[a.length];
			for(int i=0;i<a.length;i++) {
			c[i]=a[i]*b[i];
			}
			return c;
		}
		return null;
	}
	public static Integer[] div(Integer[]a,Integer[]b)
	{
		if(a.length==b.length)
		{
			Integer[]c=new Integer[a.length];
			for(int i=0;i<a.length;i++) {
			c[i]=a[i]/b[i];
			}
			return c;
		}
		return null;
	}
	public static Integer[] mod(Integer[]a,Integer[]b)
	{
		if(a.length==b.length)
		{
			Integer[]c=new Integer[a.length];
			for(int i=0;i<a.length;i++) {
			c[i]=a[i]%b[i];
			}
			return c;
		}
		return null;
	}
	public static void display(Integer[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
