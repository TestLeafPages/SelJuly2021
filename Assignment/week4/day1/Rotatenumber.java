package seleniumSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotatenumber {

	public static void main(String[] args) {
		//sorting and making the zers to right// { 4, 0, 3, 0, 1, 5, 2, 0 };
		  List<String>  mylist = new ArrayList<String>();  
	        mylist.add("4");  
	        mylist.add("0");  
	        mylist.add("3");  
	        mylist.add("0");  
	        mylist.add("1");  
	        mylist.add("5");  
	        mylist.add("2");  
	        mylist.add("0");  
 
	        System.out.println("Original List : " + mylist);    
	        //Rotate the element by distance 3
	        Collections.sort(mylist);
	        
	        System.out.println("Sorted List : " +mylist);
			/*
			 * Collections.reverse(mylist); System.out.println("Reverse order : " +mylist);
			 */
	        Collections.rotate(mylist, 3);    
	        System.out.println("Rotated List: " + mylist);
	        
	        
	   //without sorting
	        int[] num = { 4, 0, 3, 0, 1, 5, 2, 0 };
			int length = num.length;
			int count = 0;

			for (int i = 0; i < length; i++) {
				if (num[i] != 0) {
					// count value is initially 0
					// after the process, then it is incremented by 1
					
					num[count++] = num[i];
				//	num[count] = num[i];
				//	count = count+1;
					
				//	num[0] = num[0]; count = 1
				//  num[1] = num[2]; count = 2
				//  num[2] = num[4]; count = 3
				//  num[3] = num[5]; count = 4
				//  num[4] = num[6]; count = 5
			
					System.out.println(" Count :" + count);
					System.out.println("num[" + i + "]:" + num[i]);
				}
			}

			while (count < length) {
				// count = 5
				// coun t = 6 , < length (8)
				// coun t = 7 , < length (8)
				// coun t = 8 , < length (8) - FALSE
				num[count++] = 0;
				// num[5] = 0, count = 6
				// num[6] = 0, count = 7
				// num[7] = 0, count = 8
				
			}
			
			

			for (int j = 0; j < num.length; j++) {
				
				System.out.print(num[j] + " ");
				
				
	        
	        
	        
			} 
	        
	        
	}

}
