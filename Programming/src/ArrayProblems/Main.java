package ArrayProblems;

public interface Main {
	public static void main(String[] args)
	{
		//JavaApplication.execution();
		String s="0123456789";
		String s1="2356";
		int sum=0;
		int sum1=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s1.charAt(i)==s.charAt(j))
				{
					sum=Math.abs(sum1-j);
					sum1=sum1+sum;
					System.out.println(sum1);
				}
			}
		}
		System.out.println(sum1);
	}
}
