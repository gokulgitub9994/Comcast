package String;

public class StringBufferAndBuilder {
	public static void display() {
		//In StringBuffer and StringBuilder Equals,hashCode are not overridden
	StringBuffer f1=new StringBuffer("java");
	System.out.println(f1);
	StringBuffer f2=new StringBuffer("java");
	System.out.println(f2);
	System.out.println(f1.equals(f2));
	System.out.println(f1.hashCode());
	System.out.println(f2.hashCode());
	
	StringBuilder d1=new StringBuilder("core");
	System.out.println(d1);
	StringBuilder d2=new StringBuilder("core");
	System.out.println(d2);
	System.out.println(d1.equals(d2));
	System.out.println(d1.hashCode());
	System.out.println(d2.hashCode());
	
	}
	
}
