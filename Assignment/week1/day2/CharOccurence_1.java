package JavaExercises;

/*1. Write a Java Program to find the occurrence of the character'o'in the following String.
Input:"You have no choice other than following me!"
output:Occurrence of o is:6*/

public class CharOccurence_1 {

	public static void main(String[] args) {
		int count = 0;
		String str = "You have no choice other than following me!";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'o') {
				count++;
			}
		}
		System.out.println("Given String is : " + str);
		System.out.println("Occurrence of o is:" + count);
	}

}
