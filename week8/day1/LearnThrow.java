package week8.day1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class LearnThrow {
	
	public int divide(int num1, int num2) {
		int res = 0;
		if(num1 > num2) {
			res = num1 / num2;
		}
		else {
			throw new ArithmeticException("Given inputs are not valid(input1 is less than input2)");
		}
		
		return res;
	}

	public static void main(String[] args) throws InterruptedException {
	
		LearnThrow lt = new LearnThrow();
		
		int result = lt.divide(10,20);
	
		System.out.println(result);
		System.out.println("End of program");

	}

}
