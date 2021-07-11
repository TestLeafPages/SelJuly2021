package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialise
		// syntax
		// dataType[] arrName = {elemnts of array};

		char[] charArr = { 'a', 'b' };
		boolean[] boolArr = { true, false };
		String[] strArr = { "Hi", "happy", "Learning" };

		int[] numberArr = { 10, 20, 30, 40, 50, 60 };
		// System.out.println(numberArr[6]);

		// java.lang.ArrayIndexOutOfBoundsException

		// numberArr[index]
		System.out.println(numberArr[2]);
		System.out.println(strArr[2]);

		// to find the length of array
		int lengthArr = numberArr.length;
		System.out.println("Length of the array:" + lengthArr);

		for (int i = 0; i < lengthArr; i++) {
			System.out.println("Element of index " + i + "is:" + numberArr[i]);
		}

		System.out.println("******************");

		int[] sortArr = { 101, 20, 3044, 410, 50, 6 };
		Arrays.sort(sortArr);
		// ascending order
        // 6,20,50,101,410,3044
		
		System.out.println("***********");
		System.out.println(sortArr[1]);
		System.out.println(sortArr[2]);
		System.out.println("***********");
		
		
		for (int i = 3; i < (sortArr.length) - 1; i++) {
			System.out.println("Element of index " + i + "is:" + sortArr[i]);
		}

		System.out.println(" Reversed output");
		for (int i = sortArr.length - 1; i >= 0; i--) {
			System.out.println("Element of index " + i + "is:" + sortArr[i]);
		}

		// difference between int str[]={10,20,30,40} and int[] str={10,20,30,40}

	}

}
