package JavaCodes;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		/*
		 Pseudo Code
		 * Declare String Input as Follow
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 */

	//	changeme
	// 0 = c   c
    // 1 = h   H
	// 2 = a   a
	// 3 = n   N
		
		
		
		
		
		
      String test = "changeme";
      
    //  Integer.parseInt(arg0)
      
      char ch[] = test.toCharArray();
      for (int i = 0; i < ch.length; i++) {
    	 
	}
      
      for (int i = 0; i < ch.length; i++) {
    	  
    	if (i%2 !=0)
			System.out.println(Character.toUpperCase(ch[i]));
    
		else
			System.out.println(ch[i]);
	}
      
		
	}
}
