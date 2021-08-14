package assignmentcodesweek3;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="Java Exercises";
  System.out.println(s.indexOf("E"));
  System.out.println(s.indexOf("s"));
  
  System.out.println("*****************************************************"); 	
  //Assigntment exploring equals
  String str1="I am Learning Java";
  String str2= "I am learning java";

  if (str1==str2)
  {
  	System.out.println("compares memory address : Output as Same Text");
  }
  else 
	  	System.out.println("compares memory address : Output as Different Text");
 
	  
	  if(str1.equals(str2))
  {
	  System.out.println("compares string value with case sensitivity and Output as Same Text"); 
  }
  else
	  
	  System.out.println("compares string value with case sensitivity and Output as different Text"); 
 
	  
	  if (str1.equalsIgnoreCase(str2))
	
  {
	  System.out.println("compares string value with ignoring case sensitivity"); 
	  
  }else
  {
	  System.out.println("Default Value");
  }
	  System.out.println("*****************************************************"); 	

//Assignment 3 replace the character
	  String sentence = "I am working with Java8";
      String replacedword = sentence.replaceAll("\\d", "11");
      System.out.println("Repaced  8 with 11: "+replacedword);
	  System.out.println( replacedword.concat("#"));
	  System.out.println(replacedword.substring(5,14));
	  System.out.println("*****************************************************"); 	

	
	
		
	
	}
	
	


}
