package seleniumSample1;

public class Pallindrome {

	public static void main(String[] args) {
	
		// noon=noon
		//madam=madam
		//radar=radar
		String input= " hai";
		String reverse="";
		
		char[] str= input.toCharArray();
		for(int i=str.length-1;i >=0;i--)
		{
			reverse=reverse+str[i];
		}
		System.out.println("The original String :" +input);
		System.out.println("The reversed String : " +reverse);
		
		if(input.equals(reverse))
		System.out.println(" The given string " + reverse + "is a Pallindrome");
		else System.out.println(" The given string " + reverse + "is not a Pallindrome");
	}

}
