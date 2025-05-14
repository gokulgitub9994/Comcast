package chumma;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 6, 8 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of elements in the array :" + sum);

	}
}
