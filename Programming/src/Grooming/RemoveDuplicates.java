package Grooming;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="kalai";
		char[]str=s.toCharArray();
//		LinkedHashSet<Character> l=new LinkedHashSet<>();
//		for(int i=0;i<str.length();i++)
//		{
//			l.add(str.charAt(i));
//		}
//		System.out.println(l);
		int j=0;
		for(int i=0;i<str.length;i++)
		{
			if((str[i]==str[j])&&(str[i]!='\0')&&(j!=i))
			{
				System.out.print(1);
				str[i]='\0';
				j++;
			}
			if(i==str.length-1)
			{
				System.out.println(2);
				j++;
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!='\0')
			{
				System.out.println(str[i]);
			}
		}
	}
}
