package chumma;

import java.util.ArrayList;

public class Set {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();

		str.add("I");
		str.add("Love");
		str.add("Pizza");

		for (int i = 0; i <= str.size() - 1; i++) {
			System.out.println(str.get(i));

		}
		System.out.print("Original List: " + str);
		str.set(2, "Love");
		str.set(1, "Pizza");
		System.out.println();
		System.out.print("Updated List: " + str);
	}

}
