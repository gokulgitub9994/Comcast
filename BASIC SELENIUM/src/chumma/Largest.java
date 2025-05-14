package chumma;

import java.util.LinkedHashSet;

public class Largest {

	public static void main(String[] args) {
		
		
		String org = "programming";
		String rev = " ";
		LinkedHashSet<Character> lset = new LinkedHashSet<Character>();
		//StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<org.length();i++) {
			lset.add(org.charAt(i));
		}
		
		for(Character ch : lset) {
			//sb.append(ch);
			rev=rev+ch;
		}
		
		//sb.toString();
		
		
		System.out.println("Removed string :"+rev);
	}

}
