package String;

public class JavaProgram {
	public static void execution()
	{
		//In String toString,equals,hashCode are overridden
		String s1 = "java";
		System.out.println(s1);
		String s2 =new String("core");
		System.out.println(s2);
		
		String str1="abc";
		String str2="abc";
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		
	}
}
