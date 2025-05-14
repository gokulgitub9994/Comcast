package Resources;

public class JavaProgram {
	public static void execution()
	{
		Resource r=new Resource();
		MyThread1 myThread1=new MyThread1(r);
		Thread thread1=new Thread(myThread1);
		thread1.start();
		
		MyThread2 myThread2=new MyThread2(r);
		Thread thread2=new Thread(myThread2);
		thread2.start();
	}
}
