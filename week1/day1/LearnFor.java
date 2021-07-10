package week1.day1;

public class LearnFor {
	// Looping statements
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ctrl F11 - executing
		// cntrl shift f - formating
		// cntrl + shift + * - commenting
		// cntrl + / - commenting
		// cntrl + \ - Uncommenting

		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println("****************");

		// for loop
		// syntax
		// for(initialisation; condition; increment)
		// i++ --> i = i+1;
	// i = 0;  0 <= 3 (true); execute ( print i) -->0 ; i = 1 
	// i = 1;  1 <= 3 (true); execute ( print i) -->1 ; i = 2 
	// i = 2;  2 <= 3 (true); execute ( print i) -->2 ; i = 3 
	// i = 3;  3 <= 3 (true); execute ( print i) -->3 ; i = 4 
	// i = 4;  4 <= 3 (false); Not execute ( Not print i) -->terminated
		
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("****************");
			System.out.println(i);
		}
		
		System.out.println(" End of For loop");

	}

}
