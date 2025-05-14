package Grooming;

public class Main {

	public static void main(String[] args) {
		String str="ka l ai ";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
