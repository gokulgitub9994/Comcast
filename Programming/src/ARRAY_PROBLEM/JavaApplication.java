package ARRAY_PROBLEM;

public interface JavaApplication {
	public static void execution()
	{
		Integer[]a=new Integer[] {1,2,3};
		Array.display(a);
		Integer[]b=new Integer[] {4,5,6};
		Array.display(b);
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int choice=scan.nextInt();
		scan.close();
		switch(choice)
		{
		case 1:Integer[]c=Array.add(a, b);
		System.out.println("Addition");
		Array.display(c);
		break;
		case 2:Integer[]d=Array.sub(a, b);
		System.out.println("Subtraction");
		Array.display(d);
		break;
		case 3:Integer[]e=Array.mul(a, b);
		System.out.println("Multiplication");
		Array.display(e);
		break;
		case 4:Integer[]f=Array.div(a, b);
		System.out.println("Division");
		Array.display(f);
		break;
		case 5:Integer[]g=Array.mod(a, b);
		System.out.println("Modulo");
		Array.display(g);
		break;
		}
	}
}
