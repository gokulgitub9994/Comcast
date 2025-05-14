package StringMinMax;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String str="Java is a Programming Language";
		ArrayList<Character> al1=new ArrayList<Character>();
		ArrayList<Character>al2=new ArrayList<Character>();
		ArrayList<Character>max=new ArrayList<Character>();
		ArrayList<Character>min=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				al1.add(str.charAt(i));
			}
			else if(str.charAt(i)==' ')
			{
				if(al1.size()>al2.size())
				{
					max.addAll(al1);
				}
				//continue;
			}
		}
	}
}
