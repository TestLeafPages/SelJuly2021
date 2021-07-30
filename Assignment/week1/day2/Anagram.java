package JavaCodes;

import java.util.Arrays;

public class Anagram {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String text1 = "stops";
			String text2 = "potss";
			
//		level1 check	
			// 1. length of both strings must be the same
			
			// Get the text Length
//			int t1Length =  text1.length(); 
//			int t2Length = text2.length();
			// convert string to character array
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			
			
			// Sort the arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if (text1.length() == text2.length()) {
				if (Arrays.equals(ch1, ch2)) {
					System.out.println("Anagram");
				} else {
		            System.out.println("Not an Anagram");
				}
			}
			else
			{ 
				System.out.println("Not a Valid string");}
				
			}
	}

