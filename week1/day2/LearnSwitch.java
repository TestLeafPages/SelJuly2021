package week1.day2;

public class LearnSwitch {

	public static void main(String[] args) {
		int amount = 200;
		switch (amount) {
		case 100:
			System.out.println(" amount is 100");
			break;
		case 200:
			System.out.println(" amount is 200");
			break;
		case 300:
			System.out.println(" amount is 300");
			break;
		default:
			System.out.println(" Amount is not valid");
		}
		
		int a = 5;
		int b=2;
		switch(a*b) {
		case 10:
			System.out.println("10");
			break;
		case 18:
			System.out.println("18");
			break;
		default:
			System.out.println("Not valid a and b values");
		}
		
		String str = "Hi";
		switch(str) {
		case "Hi":
			System.out.println("My wishes in the morning");
			break;
		case "Hello":
			System.out.println("Hello");
			break;
		default:
			System.out.println("Not valid string");
		}
		
	}

}
