package Grooming;

public class Anagram {
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		int flag=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						flag=1;
						break;
					}
					else
					{
						flag=0;
					}
				}
			}
			if(flag==1)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not a anagram");
			}
		}
		else
		{
			System.out.println("not a anagram");
		}
		
	}
}
