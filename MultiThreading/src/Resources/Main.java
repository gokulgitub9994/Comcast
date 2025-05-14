package Resources;

public class Main {

	public static void main(String[] args) {
		//JavaProgram.execution();
//		String st1="study";
//		String st2="dusty";
//		char[] s1=st1.toCharArray();
//		char[] s2=st2.toCharArray();
int flag=0;
//		for(int i=0;i<s1.length;i++)
//		{
//			for(int j=0;j<s2.length;j++)
//			{
//				if(s1[i]==s2[j])
//				{
//					flag=1;
//					break;
//				}
//				else {
//					flag=0;
//				}
//			}
//			if(flag==0)
//			{
//				System.out.println("false");
//				break;
//			}
//			
//		}
//		if(flag==1)
//		{
//			System.out.println("true");
//		}
		
		String s="swiss";
		//System.out.println(s.charAt(0));
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length()-1;j++)
				
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i));
					System.out.println(s.charAt(j));
					flag=1;
					//s.charAt(j)="0";
				}
			}
			if(flag!=0)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
