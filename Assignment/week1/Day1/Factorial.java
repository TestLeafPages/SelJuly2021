package week1_Day2.Assignment;

public class Factorial {

	public static void main(String[] args) {

		// 6! = 6*5*4*3*2*1
		// 5! = 5*4*3*2*1
		// n! = n*(n-1)*(n-2)*(n-3)*......*1
		
		int num = 5;
		int fact = 1;                                           //   {i++}                {i--}
                //    |initialization| Condition | Statement|          // 1*2*3*4*5    (or)    5*4*3*2*1
		for (int i = num; i > 0; i--) {
			                                               //   1     1       |   5     1
			fact = fact * i;                               // fact = fact * 1 | fact = fact * 5
		}                                                      //   2     1       |  20     5
		                                                       // fact = fact * 2 | fact = fact * 4
                System.out.println("Factorial of "+num+" :- "+fact);   //   6     2       |  60     20
                                                                       // fact = fact * 3 | fact = fact * 3
	} 	                                                       //  24     6       |  120    60
}                                                                      // fact = fact * 4 | fact = fact * 2
		                                                       //  120    24      |  120    120
	                                                               // fact = fact * 5 | fact = fact * 1

