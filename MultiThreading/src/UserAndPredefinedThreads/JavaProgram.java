package UserAndPredefinedThreads;

public class JavaProgram {
	public static void execution()
	{
		MyThread2 thread=new MyThread2();
		Thread myThread=new Thread(thread);
		myThread.start();
		for(int i=0;i<6;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Pre-deined : "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
