package ArrayToString;

public interface JavaApplication {
	public static void execution()
	{
		String s="java";
		char[] str1=new char[s.length()];
		System.out.println(str1);
		char[] str=s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		String s1=new String(str);
		System.out.println(s1);
		
		StringBuffer s3=new StringBuffer(s1);
		System.out.println(s3);
		}
}
