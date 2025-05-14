package Resources;

public class MyThread2 implements Runnable{

	Resource resource; 
    MyThread2(Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run() {
		resource.data(5);
	}
}
