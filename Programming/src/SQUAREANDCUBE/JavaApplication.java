package SQUAREANDCUBE;

import java.util.ArrayList;

public interface JavaApplication {
	public static void execution()
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int size;
		System.out.println("Enter size: ");
		size=scan.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			}
		scan.close();
		ArrayList<Integer> evensqr=new ArrayList<Integer>();
		ArrayList<Integer> evencub=new ArrayList<Integer>();
		ArrayList<Integer> oddsqr=new ArrayList<Integer>();
		ArrayList<Integer> oddcub=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evensqr.add(arr[i]*arr[i]);
				evencub.add(arr[i]*arr[i]*arr[i]);
			}
			else {
				oddsqr.add(arr[i]*arr[i]);
				oddcub.add(arr[i]*arr[i]*arr[i]);
			}
		}
		System.out.println("EVEN SQUARE:");
		for(int i:evensqr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("ODD SQUARE:");
		for(int i:oddsqr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("EVEN CUBE:");
		for(int i:evencub)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("ODD CUBE:");
		for(int i:oddcub)
		{
			System.out.print(i+" ");
		}
	}
	
}
