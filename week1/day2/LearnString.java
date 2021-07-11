package week1.day2;

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
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	

	
		
		
		
	}

}
