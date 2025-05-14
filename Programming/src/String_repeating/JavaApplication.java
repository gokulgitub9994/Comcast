package String_repeating;

public interface JavaApplication {
	public static void execution()
	{
		String s="software";
		String s1=s.toUpperCase();
		System.out.println(s1);
		int len=s1.length();
		System.out.println(len);
		char[] s2=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print(s2[len-1]);
			}
			len--;
			System.out.print(" ");
		}
	}
}
