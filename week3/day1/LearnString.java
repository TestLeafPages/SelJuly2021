package week1.day1;

public class LearnString {
	// String - Non primitive data type
		// String is a class
		// Methods for this class
		// Immutable 
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     // Initialisation
		 // 2 ways : Literals, Objects
		String text = "Happy-Day-everD-and Dever";
		
		// To get the length 
		// length() is a method
		// in array length is property
		int lengthText= text.length();
		System.out.println(" Length :" + lengthText);
		
		// To get a character at a given position
		 char charAt = text.charAt(6);
		 // input --> position
		 // output --> character
		 System.out.println(" Character at the given position: " + charAt);
		 
		 // To get the position of a particluar character
		 // input --> character
		 // output --> position of the first occurence of the char
		 int indexOf = text.indexOf('D');
		 
		 System.out.println(" Position of the character:"+ indexOf);
		 
		 int lastIndexOf = text.lastIndexOf('D');
		 System.out.println(" Position of the last character:"+ lastIndexOf);
		 
		 
		 char[] charArray = text.toCharArray();
		 for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray[" + i + "]: " +  charArray[i]);
		}
		 
		 String[] split = text.split("-");
		 for (int i = 0; i < split.length; i++) {
			 System.out.println("split[" + i + "]: " +  split[i]);
		}
		 
				 
		 // String text = "Happy-Day-everD-and Dever";
		 // substring
		 String subStr1 = text.substring(8);
		 System.out.println(" subString of 8:" + subStr1);
		 
		 String subStr2 = text.substring(8, 10);  // y-eve       y-ev
		 System.out.println(" Substr from 8 to 12:" + subStr2);
		 // start index is inclusive
		 // End Index is exclusive
		 // prints from 8 to 11 ( excludes 12)
		 
		 // replace
		 String replace = text.replace('D', '*');
		 System.out.println(" Replaced text:"+ replace);
		 
		 // replace all
		 
		
		 String text1 = "TestLeaf1234";
		 
		 // print only the text ( no numbers)
		 // d --> integers
		 String replaceAll = text1.replaceAll("[\\d]", ""); //- non integers
		 System.out.println(" Replaced ---- :" + replaceAll);
		// Replaced ---- :TestLeaf
		 System.out.println(" text1 after replacement"+ text1);
		 
		 // print only the numbers ( no alphabets)
		 // D --> Non integers
		 String replaceAll2 = text1.replaceAll("[\\D]", ""); //- integers
		 System.out.println(" Replaced all the ----"+ replaceAll2);
		 // Replaced all the ----1234
		 
		 
		 String str1 = " Hello";
		 String str2 = " Hello1";
		 
		 // compares the contents of the strings 
		 boolean equals = str1.equals(str2);
		 System.out.println(equals);
		  
		 
		 
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		  
		 System.out.println("*************");
			 
		 
		 // IMMUTABLE - why?
		 // value cannot be shanged
		 // text = "Happy-Day-everD-and Dever"
		 
		 System.out.println(" FInal text"+ text);
		 
		 
		 
		 
		 
}
}
