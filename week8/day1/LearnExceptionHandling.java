package week8.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		int z = 0;

		int[] nums = { 10, 20, 30 };

		try {
			z = x / y;
			
			try {
				System.out.println(nums[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
				
		}
		catch (ArithmeticException e) {
			System.out.println(e);
				} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(z);

		System.out.println("End of program");

	}

}
