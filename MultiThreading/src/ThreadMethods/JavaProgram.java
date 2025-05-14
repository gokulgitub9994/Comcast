package ThreadMethods;

public class JavaProgram {
	public static void execution()
	{
		System.out.println("pre-defined thread details");
		System.out.println(Thread.currentThread().threadId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Pre-defined thread");
		Thread.currentThread().setName("kalai");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		MyThread t=new MyThread();
		Thread th=new Thread(t);
		th.start();
	}
}
