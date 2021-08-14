package assisment.day2;

public class Reverseevenword {
	public static void main(String[] args) {
  		String test = "Selenium automation testing"; 
  		String[] arr1=test.split(" ");
  		for (int i = 0; i < arr1.length; i++) {
			if(i%2!=0) {
				String word=arr1[i];
				String[] arr2=word.split("");
				for (int j = arr2.length-1; j>=0; j--) {
					System.out.print( arr2[j] );
				}
			}
				else 
				{
					System.out.print(" "+arr1[i]+" ");
				
				}
			}
		}


}
