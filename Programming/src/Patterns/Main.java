package Patterns;

public interface Main {
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=7;j++)
//			{
//				if(j%2==0)
//				{
//					System.out.print("_");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		//OUTPUT
//		*_*_*_*
//		*_*_*_*
//		*_*_*_*
//		*_*_*_*
//		*_*_*_*
		
		
//		for(int i=1;i<=5;i++)
//		{
//			int asci=65;       
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print((char)asci);
//				asci++;
//			}
//			System.out.println();
//		}
		//OUTPUT
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE
//		ABCDE
		
		
//		int asci=65;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print((char)asci);
//			}
//			asci++;
//			System.out.println();
//		}
		
		//OUTPUT
//		AAAAA
//		BBBBB
//		CCCCC
//		DDDDD
//		EEEEE
		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			int num=1;
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(num);
//				num=num+2;
//			}
//			System.out.println();
//		}
		
		
		//OUTPUT
//		13579
//		13579
//		13579
//		13579
//		13579
		
	
		
		
//		int num=1;
//		for(int i=1;i<=5;i++)
//			{
//				for(int j=1;j<=5;j++)
//				{
//					System.out.print(num);
//				}
//				num+=2;
//				System.out.println();
			//}
		
		//OUTPUT
		
//		11111
//		33333
//		55555
//		77777
//		99999
		
		
		
		
//		int num=8;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(num);
//			}
//			num=num-2;
//			System.out.println();
//		}
//		
		//OUTPUT
		
//		88888
//		66666
//		44444
//		22222
//		00000
		
		
		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			int num=8;
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(num);
//				num=num-2;
//			}
//			System.out.println();
//		}
		
		//OUTPUT
		
//		86420
//		86420
//		86420
//		86420
//		86420
		
		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			for(char ch='a';ch<='z';ch++)
//				{
//					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//					{
//						System.out.print(ch);
//					}
//				}
//			System.out.println();
//		}
		
		//OUTPUT
		
//		aeiou
//		aeiou
//		aeiou
//		aeiou
//		aeiou
		
		
		
//		for(char ch='a';ch<='z';ch++)
//		{
//			int flag=0;
//			for(int i=1;i<=5;i++)
//				{
//					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//					{
//						System.out.print(ch);
//						flag=1;
//					}
//					else
//					{
//						break;
//					}
//				}
//			if(flag==1)
//			{
//				System.out.println();
//			}
//		}
//		
		//OUTPUT
		
//		aaaaa
//		eeeee
//		iiiii
//		ooooo
//		uuuuu
		String s="xyz";
		s.toUpperCase();
		String a=s.replace('Y', 'y');
		a=a+"abc";
		System.out.println(a);
	}
}
