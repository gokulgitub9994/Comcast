package ARRAY_PROBLEM;

public interface Main {
	public static void main(String[] args) {
		//JavaApplication.execution();
		String s="abcadbca";
		String s1="bca";
		int j=0;
		int count=0;
		System.out.println(s1.length());
		for(int i=0;i<s.length();i++)
		{
			if((j<s1.length())&&(s1.charAt(j)==s.charAt(i)))
			{
				System.out.print(j);
				j++;
				System.out.println(i);
				//System.out.println(j);
				//continue;
			}
			if(j==s1.length())
			{
				count++;
				i--;
				//System.out.println(i);
				j=0;
			}
			
		}
		System.out.println(count);
	}

}
