package seleniumSample1;

import java.util.Arrays;

public class Missingelements {

	public static void main(String[] args) {
				
		int[] arr= {2,3,1,4,6,8};
		
		Arrays.sort(arr);//1, 2,3,4,6,7
		
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[i-1])
				
			{
				System.out.println("The Missing Element is" +i);
				continue;
				
			}
		}
		
	  
		
		
		
		
		
	}

}
