package String;

public class StringInBuildMethods {
	public static void inBuild()
	{
		//Startswith and endswith method
//		String s1="core";
//		System.out.println(s1);
//		System.out.println(s1.startsWith("c"));
//		
//		String s2="java";
//		System.out.println(s2);
//		System.out.println(s2.endsWith("a"));
//		//Replace method
//		String s3="String";
//		System.out.println(s3);
//		System.out.println(s3.replace('i', 'o'));
//		
//		String s4="Java is an object oriented programming language";
//		System.out.println(s4);
//		System.out.println(s4.replace("Java","Javascript"));
//		
//		String s5="09AZaz";
//		System.out.println(s5);
//		//char Array (charAt)
//		for(int i=0;i<s5.length();i++)
//		{
//			System.out.println(s5.charAt(i));
//		}
//		//ASCII values
//		for(int i=0;i<s5.length();i++) {
//			System.out.println(s5.charAt(i)+" "+s5.codePointAt(i));
//		}
//		
//		//Substring starting point is inclusive and ending point is exclusive
//		String s6="COREJAVA";
//		System.out.println(s6);
//		System.out.println(s6.substring(4));
//		System.out.println(s6.substring(0,4));
		
		//CRUD operation will be performed only on StringBuffer and StringBuilder
		
		StringBuffer s7=new StringBuffer();
		System.out.println(s7);
		s7.insert(0, "Software-Developer");
		System.out.println(s7);
		s7.setCharAt(8, '_');
		System.out.println(s7);
		s7.delete(9, 18);
		System.out.println(s7);
		s7.deleteCharAt(8);
		System.out.println(s7);
	}
}
