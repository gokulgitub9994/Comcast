package PatternsUsingThred;

public class JavaApplication {
	public static void execution()
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String s;
		System.out.println("Enter String");
		s=scan.nextLine();
		scan.close();
		MyThread th=new MyThread(s);
		Thread th1=new Thread(th);
		th1.start();
	}
}

