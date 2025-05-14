package Grooming;

public class FirstletterCapital {
	public static void main(String[] args) {
		String s="kalai arasan";
		char[] str=s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			if(i==0)
			{
				str[i]=(char) (str[i]-32);
			}
			else if(str[i]==' ')
			{
				str[i+1]=(char)(str[i+1]-32);
			}
		}
		System.out.println(str);
	}
}
