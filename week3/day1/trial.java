package week3.day1;

public class trial extends LearnMethodOverloading {

	public void getStudentDetails() {
		int id = 129785;
		String name = "Dhivya";
		char initial = 'g';
		System.out.println("Id:"+ id);
		System.out.println(" Student Name:" + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trial obj = new trial();
		obj.getStudentDetails();
		
		LearnMethodOverloading obj1 = new LearnMethodOverloading();
		obj1.getStudentDetails();
		

	}

}
