package week1.day2;

public class LearnStringInitialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // String is a class in java
		// Non - primitive data type
		// Immutable ( Once a value is assigned, it cannot be changed)
		
		// two ways of initialising a string
		// initialising using literals - MTHD1
		String name = "Happy Selenium Learning";
		System.out.println("Name:"+name);
		// initialising using new - MTHD1 (Objects)
		
		String nickName = new String();
		nickName = " pattu";
		System.out.println("nickName:" + nickName);
		
		String nickName1 = new String("kutty");
		System.out.println("nickName1:"+ nickName1);
		
		
		
		
	}

}
