package JavaCodes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupPayPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String str = "PayPal India";
		
		// Expected output: ylIndi

		// 1. Convert to character array ch[]
		// 2. Have 2 empty sets
		// --> charSet - Store the unique chrs
		// --> dupCharSet - store all the duplicate characters
		// 3. Add all ch[] to charSet
		// o/p: Payl Indi
		// 4. when the dup chrs are not added, put it inside the dupCharSet
		// o/p : Pa
		// 5. charSet.removeAll(dupCharSet)
		// o/p : yl Indi
		// 6. Remove the space

		String str = "PayPal India";

		// 1. Convert to character array

		char[] ch = str.toCharArray();
		// 2. Have 2 empty sets

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (Character eachChar : ch) {
			if (!charSet.add(eachChar)) {
				dupCharSet.add(eachChar);
			}
		}
		
		
		// Payl Indi - charSet (stored the unique chrs)
		// Pa        - dupCharSet ( captured all the repeated chrs)
		
		
		charSet.removeAll(dupCharSet);
		
		//  yl Indi
		
		System.out.println("Charset");
		
		for (Character eachCh : charSet) {
			if(eachCh!=' ')
				System.out.println(eachCh);
		}
		
		
		/**** Method2******/
		
		
		System.out.println("**********");
		String input= "PayPal India";
		Set<Character> charSet1=new LinkedHashSet<Character>();
			
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(!charSet1.contains(charArray[i])) {
				charSet1.add(charArray[i]);
				if(charArray[i]!=' ') {
					System.out.print(charArray[i]);
				}
				
			}
		}

	}

}


