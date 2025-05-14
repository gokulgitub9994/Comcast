package chumma;

public class Patten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "inter@#@$@";
		StringBuilder sb = new StringBuilder();
		int count =0;
		for(int i =0;i<=str.length()-1;i++) {
			char c = str.charAt(i);
			if(!Character.isLetterOrDigit(c)) {
				sb.append(c).toString();
			}
		}
		System.out.println("Count :"+count);
		System.out.println("New String : "+sb);
	
		
		
		
		
	}
	
}
