package JavaExercises;

public class CharOccurence_2 {

	public static void main(String[] args) {
		int count = 0;
		String str = "You have no choice other than following me!";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='o') {
				count++;
			}
		}
		System.out.println("Occurence of o is : "+count );
	}
}
