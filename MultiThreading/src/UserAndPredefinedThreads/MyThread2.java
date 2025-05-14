package UserAndPredefinedThreads;

public class MyThread2 implements Runnable{
	@Override
	public void run()
	{
		try {
			for(int i=0;i<6;i++)
			{
				Thread.sleep(1000);
				System.out.println("User-defined : "+i);
			}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
	}
}
