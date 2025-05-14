package Resources;

public class Resource {
	public synchronized  void data(int n)
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(n+"*"+i+"="+(n*i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
