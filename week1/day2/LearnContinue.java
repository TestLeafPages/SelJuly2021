package week1.day2;

public class LearnContinue {
// when you see 5, leave that alone. Execute others.
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			// i =5
			if (i == 5) {
				continue; // skipped
			}
			System.out.println(i);
		}
		System.out.println("*************8");
		// print only even numbers
		// skip all the odd numbers
		
		for (int i = 0; i < 25; i++) {
			if(i%2 != 0 ) {
				// skip
				continue;
			}
			else {
				System.out.println(i);
			}
			
		}

	}
}
