package week3.day1;

public class Calculator {
	
	// add() overloading
	//  1 method with 2 int args
	public void add(int num1, int num2) {
         int result = num1 + num2;
         System.out.println(" REsult of adding two numbers:" + result);
	}
	
	//1 method with 3 int args
	public void add(int num1, int num2, int num3) {
		 int result = num1 + num2 + num3;
         System.out.println(" REsult of adding Three numbers:" + result);
	}
	
	//1 method with 2 int args
	public void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("Result of multiplying Three numbers: " + result);
	}
	
	//1method with 1 int and 1 double args
	public void multiply(int num1, double num2) {
		double  result = num1 * num2;
		System.out.println("Result of multiplying integer and a double numbers: " + result);
	}
		
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(5, 4);
		calc.add(3, 67, 78);
		calc.multiply(2, 2.5);
		calc.multiply(4, 8);
		
	}

}
