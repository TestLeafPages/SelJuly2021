package week1.day1;

public class LearnWhile {

	// stopping it based on some condition
	// Explicit stop point is not available for while

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input = 123;
		// Problem statement : sum of all the digits
		// 1 + 2 + 3 = 6

		int number = 1238768;
		int sum = 0;
		
		// 123 --> reminder = 3
		//     --> quotient = 12
		//     --> sum = 0 + 3  sum = 3
		//     --> number = 12
		
		
		// 12 -->    reminder = 2
				//     --> quotient = 1
				//     --> sum = 3 + 2  sum = 5
				//     --> number = 1
		
		// 1 --> 1 > 0 ( true)
		 //  --> reminder = 1
		 //  --> quotient = 1/10 == 0.1 = 0
		//   --> sum =  5+ 1 sum = 6
		//   --> number = 0
		
		// 0 --> 0 > 0 (false)
		//    --> comes out of the loop
		

		while (number > 0) {
			int reminder = number % 10;
			int quotient = number / 10;
			sum = sum + reminder;
			number = quotient;
			
			System.out.println("reminder:"+ reminder);
			System.out.println("quotient:"+ quotient);
			System.out.println("sum:"+ sum);
			System.out.println("number:"+ number);
			System.out.println("*************");
		}
		System.out.println(sum);
		
		
	/*	do {
			int reminder = number % 10;
			int quotient = number / 10;
			sum = sum + reminder;
			number = quotient;
			
			System.out.println("reminder:"+ reminder);
			System.out.println("quotient:"+ quotient);
			System.out.println("sum:"+ sum);
			System.out.println("number:"+ number);
			System.out.println("*************");
		}while(number > 0); */

	}

}
