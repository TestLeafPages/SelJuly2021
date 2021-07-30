package seleniumSample1;
public class PrimeNumber{
	
	public static void main(String[] args) {
		
		/*
		 * Prime number--> divisible by the number itself and by 1 the number has only 2
		 * factors
		 * 
		 * 5---1 and 5-->2 factors-->prime number 6 --2 3 6--> 3 factors-->not a prime
		 * number
		 */
		int input = 4;
		int count=0;
		
		for (int i=1;i<=input;i++)
		{
			if (input % i==0) //5%1==0 count 1(0+1)
				        ///5%2==0 count 1 
				           //5%3==0 count 1
				           //5%4==0 count 1
				           //5%5==0 count 2(1+1)
				count= count+1;
		}
		
		if(count==2)
		{
			System.out.println(input+ "is a prime number");
		}else 
			System.out.println(input+ "is not a prime number");
		
		
		 
	}

}
  