package DayMonthPairs;

import java.util.*;
public interface JavaApplication {
	public static void execution()
	{
		String [] str1=new String[] {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		String[] str2=new String[] {"january","february","march","april","may","june","july","august","september","october","november","december"};
		LinkedHashSet<String>arr=new LinkedHashSet <String> ();
		int count=0;
		for(int i=0;i<str2.length;i++)
		{
			int len1=str2[i].length();
			for(int j=0;j<str1.length;j++)
			{
				if(len1==str1[j].length())
				{
					arr.add(str2[i]+"-"+str1[j]);
				}
				else {
					String s=str2[j];
					for(int k=0;k<str1.length;k++)
					{
						int len2=str1[k].length();
						for(int l=0;l<str2.length;l++)
						{
							if((s.length()+str2[l].length())==len2)
							{
								arr.add(s+"-"+str1[k]);
								arr.add(str2[l]+"-"+str1[k]);
							}
						}
					}
				}
			}
		}
		for(String s:arr)
		{
			System.out.println(s);
			count++;
		}
	System.out.println(count);
	}
}
