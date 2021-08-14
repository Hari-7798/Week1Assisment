package assisment.day2;

public class Mycalcularor {
	public static void main(String[] args) {
		Calculator calculate= new Calculator();
		System.out.println("The sum of the given num = " + calculate.add(20, 30, 40));
		System.out.println("The sub of the given num = " + calculate.sub(10, 17));
		System.out.println("The mul of the given num = " + calculate.mul(14.25678, 7.32000));
		System.out.println("The div of the given num = " + calculate.div(12.5f, 6.1f));
		
	}

}
