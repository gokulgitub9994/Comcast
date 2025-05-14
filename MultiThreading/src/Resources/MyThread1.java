package Resources;

public class MyThread1 implements Runnable {
	Resource resource;
	public MyThread1(Resource resource)
	{
		this.resource=resource;
		//System.out.println(resource);
	}
	@Override
	public void run() {
		resource.data(2);
	}
}
