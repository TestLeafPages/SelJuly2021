package JavaExercises;

public class CharOccurence_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "You have no choice other than following me!";
		String replaceStr = str.replaceAll("[^o]", "");
		System.out.println("Occurence of o is : "+ replaceStr.length());
	}
}

