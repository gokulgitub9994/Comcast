package CollectionFramework;

import java.util.ArrayList;

public class JavaProgram {
	public static void execution()
	{
//		ArrayList<Integer> all=new ArrayList<Integer>();
//		all.add(1);
//		all.add(1);
//		all.add(1);
//		all.add(2);
//		all.add(3);
//		all.add(4);
//		all.add(7);
//		all.add(8);
//		System.out.println(all);
//		
//		ArrayList<Integer> al2=new ArrayList<Integer>();
//		al2.add(11);
//		al2.add(2);
//		al2.add(3);
//		al2.add(4);
//		al2.add(7);
//		al2.add(8);
//		System.out.println(al2);
//		
//		System.out.println(all.equals(al2));
//		
//		System.out.println(all.hashCode());
//		
//		System.out.println(al2.hashCode());
//		
//		ArrayList al=new ArrayList();
//		al.add(1);
//		al.add(1);
//		al.add(1);
//		al.add(null);
//		al.add(null);
//		al.add(null);
//		al.add('k');
//		al.add("Java");
//		System.out.println(al);
		
		
		
		//CRUD operation on ArrayList
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(1);arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(7);
//		for(int i=0;i<arr.size();i++)
//		{
//			System.out.println(arr.get(i));
//		}
//		arr.set(3, 20);
//		System.out.println(arr);
//		arr.remove(2);
//		System.out.println(arr);
		
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("Java");
		str.add("core");
		str.add("html");
		str.add("css");
		str.add("js");
		str.add("sql");
		System.out.println(str);
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		str.set(2, "kalai");
		System.out.println(str);
		str.remove(4);
		System.out.println(str);
	}
}
