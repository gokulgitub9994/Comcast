package String;

public class MutableAndImmutable {
	public static void program() {
		//String is immutable
		String str1="java";
		System.out.println(str1);
		String str2=str1.toUpperCase();
		System.out.println(str2);
		System.out.println(str1==str2);
		
		//StringBuffer is mutable
		 StringBuffer s1=new StringBuffer("core");
		System.out.println(s1);
		StringBuffer s2=s1.append("sql");
		System.out.println(s2);
		System.out.println(s1==s2);
		
	}
}
