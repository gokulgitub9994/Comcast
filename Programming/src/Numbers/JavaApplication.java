package Numbers;

public interface JavaApplication {
	public static void execution()
	{
//		NEON NUMBERS
		int num;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter the number : " );
		num=scan.nextInt();
		scan.close();
//		int temp=num*num;
//		int rem=0;
//		int sum=0;
//		while(temp!=0)
//		{
//			rem=temp%10;
//			sum=sum+rem;
//			temp=temp/10;
//		}
//		if(sum==num)
//		{
//			System.out.println("Neon Number");
//		}
//		else
//		{
//			System.out.println("Not a Neon Number");
//		}
//		
		// HARSHAD NUMBER
//		int temp=num;
//		int rem=0;
//		int sum=0;
//		while(temp!=0)
//		{
//			rem=temp%10;
//			sum=sum+rem;
//			temp=temp/10;
//		}
//		if(num%sum==0)
//		{
//			System.out.println("Harshad Number");
//		}
//		else
//		{
//			System.out.println("Not a harshad number");
//		}
		
		//Special Number
		
//		int temp=num;
//		int rem=0;
//		int sum=0;
//		int sum1=1;
//		while(temp!=0)
//		{
//			rem=temp%10;
//			sum=sum+rem;
//			sum1=sum1*rem;
//			temp=temp/10;
//		}
//		if((sum+sum1)==num)
//		{
//			System.out.println("Special Number");
//		}
//		else
//		{
//			System.out.println("Not a Special Number");
//		}
		
    	//RAMANUJAN NUMBER
//		int temp=num;
//		int rem=0;
//		int sum=0;
//		while(temp!=0)
//		{
//			rem=temp%10;
//			sum=sum+rem;
//			temp=temp/10;
//		}
//		int temp1=sum;
//		int rem1=0;
//		int sum1=0;
//		while(temp1!=0)
//		{
//			rem1=temp1%10;
//			sum1=sum1*10+rem1;
//			temp1=temp1/10;
//		}
//		if(sum*sum1==num)
//		{
//			System.out.println("Ramanujan Number");
//		}
//		else
//		{
//			System.out.println("Not a Ramanujan Number");
//		}
//		
		//Armstrong Number
//		int temp1;
//		int temp=temp1=num;
//		int rem=0;
//		int count=0;
//		while(temp!=0)
//		{
//			rem=temp%10;
//			temp=temp/10;
//			count ++;
//		}
//		int rem1=0;
//		int sum=0;
//		while(temp1!=0)
//			{
//			    int sum1=0;
//				rem1=temp1%10;
//				System.out.println(rem1);
//				sum1=(int)Math.pow(rem1, count);
//				System.out.println(sum1);
//				sum=sum+sum1;
//				temp1=temp1/10;
//			}
//		System.out.println(sum);
//		if(sum==num)
//		{
//			System.out.println("Armstrong Number");
//		}
//		else
//		{
//			System.out.println("Not a Armstrong Number");
//		}
		
		//STRONG NUMBER
		int temp=num;
		int rem=0;
		int sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			int temp1=rem;
			int rem1=1;
			for(int i=temp1;i>0;i--)
			{
				rem1=rem1*i;
			}
			sum=sum+rem1;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		
	}
}
