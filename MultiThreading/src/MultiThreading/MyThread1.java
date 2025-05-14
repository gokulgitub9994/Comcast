package MultiThreading;

public class MyThread1 implements Runnable{
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			Thread.sleep(1000);
			System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
