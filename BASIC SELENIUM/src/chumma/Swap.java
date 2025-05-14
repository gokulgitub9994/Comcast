package chumma;

import java.util.ArrayList;

public class Swap {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		String res = "";
		java.util.Scanner SCAN = new java.util.Scanner(System.in);
		System.out.println("Enter the input!!");
		String input = SCAN.nextLine();
		str.add(input);

		System.out.println("Before swap :" + str);

		for (int i = str.size()-1; i >=0; i--) {
			System.out.println(str.get(i));
			str.add(str.get(i));
		}
		str.remove(0);
		str.remove(1);
		System.out.println("After swap :" + str);
	}
}
