package MultiThreading;

public class JavaProgram {
	public static void execution()
	{
		MyThread my=new MyThread();
		my.start();
		
		MyThread1 myThread=new MyThread1();
		myThread.run();
	}
}
