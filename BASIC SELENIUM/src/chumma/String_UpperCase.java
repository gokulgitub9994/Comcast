package chumma;

public class String_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Program";char ch = 0;
		
			for(int i =0; i<=s.length()-1;i++) {
				 ch = s.charAt(i);
				 
				 
				 if(ch >= 'A'&&ch<='Z') {
						System.out.print("Uppercase :"+ch);
					}else {
						
						System.out.print("Lowercase : "+ch);
					}
				 System.out.println();
			}
		

	}

}
