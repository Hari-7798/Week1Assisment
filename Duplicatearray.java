package assisment.day2;

public class Duplicatearray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7,  6, 7, 8, 9, 8, 9, 7, 10};
		System.out.println(" Length of Array " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(" Duplicate Array NUmber is " + arr[i]);
				}
			}

		}

	}

}
