package assisment.day2;

public class Charoccurence {
	public static void main(String[] args) {
		String str = "Welcome to Vellore";
		char searchchar = 'o';
		int count = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchchar) {
				count++;
			}

		}
		System.out.println(" CharOfccurance is " + count);

	}

}
