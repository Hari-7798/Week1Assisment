package assisment.day2;

import java.util.Arrays;

public class Missingarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i] != j) {
				System.out.println("Missing element in the array is "+j);
				break;
			}

		}

	}
}
