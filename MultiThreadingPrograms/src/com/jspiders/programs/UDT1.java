package com.jspiders.programs;

public class UDT1 extends Thread{
	@Override
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		UDT1 th=new UDT1();
		th.start();
	}
}
