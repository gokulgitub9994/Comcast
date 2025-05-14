package Set;

import java.util.HashSet;
public class JavaProgram {
	public static void execution()
	{
		HashSet<Character> hs1=new HashSet<Character>();
		hs1.add('7');
		hs1.add('a');
		hs1.add('z');
		hs1.add('+');
		hs1.add('8');
		hs1.add('Z');
		hs1.add('@');
		System.out.println(hs1);
		
		HashSet<Character> hs2=new HashSet<Character>();
		hs2.add('7');
		hs2.add('a');
		hs2.add('z');
		hs2.add('+');
		hs2.add('8');
		hs2.add('Z');
		hs2.add('@');
		System.out.println(hs2);
		
		System.out.println(hs1.equals(hs2));
		
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		
		HashSet hs3=new HashSet();
		hs3.add(1);
		hs3.add(null);
		hs3.add(true);
		hs3.add('h');
		hs3.add("java");
		System.out.println(hs3);
		for(Object obj:hs3)
		{
			System.out.println(obj);
		}
		
		//Crud operation on HashSet imp: Update is not possible
		HashSet<Character> hs4=new HashSet<Character>();
		hs4.add('7');
		hs4.add('a');
		hs4.add('z');
		hs4.add('+');
		hs4.add('8');
		hs4.add('Z');
		hs4.add('@');
		System.out.println(hs4);
		for(char ch:hs4)
		{
			System.out.println(ch);
		}
		hs4.remove('@');
		System.out.println(hs4);
	}
}
