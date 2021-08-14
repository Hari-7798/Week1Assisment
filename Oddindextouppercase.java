package assisment.day2;

public class Oddindextouppercase {
	public static void main(String[] args) {
		 String test = "automation testing";
char[] ch=test.toCharArray();
for (int i = 0; i < ch.length; i++)
{
	if(i%2!=0) {
System.out.print(Character.toUpperCase( ch [i] ));
	}
	else
	{
		System.out.print( ch [i] );
	}

	}

	}
	

}
