package Ascii;

public interface JavaApplication {
	public static void execution()
	{
		char[] uc=new char[] {'A','E','I','O','U'};
		char[]lc=new char[] {'a','e','i','o','u'};
		int a=0,b=0;
		if(uc.length==lc.length) {
		Integer[]as=new Integer[uc.length];
		for(int i=0;i<uc.length;i++)
		{
			a=(int)uc[i];
			b=(int)lc[i];
			int rem=0;
			int temp=0;
			while(a!=0)
			{
				rem=a%10;
				temp=temp*10+rem;
				a=a/10;
			}
			int rem1=0;
			while(temp!=0)
			{
				rem1=temp%10;
				b=b*10+rem1;
				temp=temp/10;
			}
			as[i]=b;
		}
		for(int i=0;i<as.length;i++)
		{
			System.out.print(as[i]+" ");
		}
		}
	}
}
