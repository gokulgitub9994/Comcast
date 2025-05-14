package ThreadMethods;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("User-defined thread details");
		System.out.println(Thread.currentThread().threadId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		System.out.println("user-defined thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
