package DUPLICATES;

import java.util.*;
public interface JavaApplication {
	public static void execution()
	{
		int n=123215;
		int num = 0;
		int d;
		System.out.println(n);
		while(n!=0)
		{
			d=n%10;
			num=num*10+d;
			n=n/10;
		}
//		//System.out.println(num);
//		ArrayList<Integer>al=new ArrayList<Integer>();
//		while(num!=0)
//		{
//			al.add(num%10);
//			num=num/10;
//		}
//		//System.out.println(al);
//		LinkedHashSet<Integer> al1=new LinkedHashSet<Integer>(al);
//		al.clear();
//		al.addAll(al1);
//		//System.out.println(al);
//		for(int i=0;i<al.size();i++)
//		{
//			n=n*10+al.get(i);
//		}
		System.out.println(n);
//		
	}
}
