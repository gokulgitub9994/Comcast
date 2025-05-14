package Throws;


public class ArithematicOperations {
	public static void display(int i,int j) throws ArithmeticException{
		if((i!=0)&&(j!=0))
		{
			int k=i/j;
			System.out.println(k);
		}
		else
		{
			throw new ArithmeticException();
		}
		
	}
}
