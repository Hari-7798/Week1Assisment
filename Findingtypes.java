package assisment.day2;

public class Findingtypes {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String test = "## Selenium automation testing 2nd week ## ";
			int  letter = 0, space = 0, num = 0, specialChar = 0;
	char[] A =test.toCharArray();
	for (int i = 0; i < A.length; i++) {
		if(Character.isDigit(A[i])) {
			num =num+1;

		}
		else if(Character.isAlphabetic(A[i]))
			letter=letter+1;
		
		else if(Character.isSpaceChar(A[i]))
			space=space+1;	
		else
			specialChar=specialChar+1;	
	}
		System.out.println("Numbers :" + num);
		System.out.println("Letter :" + letter);
		System.out.println("Space : " + space);
		System.out.println("SpecialChar :" + specialChar);
			
		}


}
