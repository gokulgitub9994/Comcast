package chumma;

public class String_Prgrm {

	public static void main(String[] args) {

//		String str = "mom";  String rev ="";
//		
//		for(int i =str.length()-1; i>=0;i--) {
//			 rev =rev+str.charAt(i);
//			
//		}
//		System.out.println(rev);
//		
//		if(rev.equals(str)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not palindrome");
//		}
		
		String str = "mom";
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
	}

}
