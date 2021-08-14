package assisment.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		boolean a = false;
		if (text1.length() == text2.length()) {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length - 1; i++)
				if (ch1[i] == ch2[i]) {
					a = true;
				} else {
					a = false;
					break;
				}
		}

		if (a == true) {
			System.out.println("Given String is Equal");
		} else {
			System.out.println("Given String Not Equal");
		}
	}

}
