package com.jspiders.programs;

public class UDT2 implements Runnable{
	@Override
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		UDT2 th=new UDT2();
		Thread t=new Thread(th);
		t.start();
		
	}
}
