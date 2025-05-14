package PatternsUsingThred;

public class MyThread implements Runnable {
	String s;
	MyThread(String s)
	{
		this.s=s;
	}
//	@Override
//	public void run()
//	{
//		try {
//			for(int i=0;i<s.length();i++)
//			{
//				for(int j=0;j<s.length();j++)
//				{
//					System.out.print(s.charAt(i)+" ");
	//              Thread.sleep(1000);
//				}
//				System.out.println();
//			}
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	@Override
	public void run()
	{
		try {
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<s.length();j++)
				{
					System.out.print(s.charAt(j)+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
