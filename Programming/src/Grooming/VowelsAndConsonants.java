package Grooming;

import java.util.ArrayList;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		String str="abcdef";
		ArrayList<Character>al1=new ArrayList<Character>();
		ArrayList<Character>al2=new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				al1.add(str.charAt(i));
			}
			else
			{
				al2.add(str.charAt(i));
			}
		}
		System.out.println("Vowles:"+al1);
		System.out.println("Consonants:"+al2);
	}
}
