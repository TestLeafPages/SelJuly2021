package week3.day1;

public class LearnMethodOverloading {

	// method signature

	// Accessmodifier returntype methodname()
	// mthds have same name + diff num of/type arguments

	public void getStudentDetails() {
		int id = 129785;
		String name = "Dhivya";
		System.out.println("Id:"+ id);
		System.out.println(" Student Name:" + name);
	}

	public void getStudentDetails(int studID) {
		System.out.println(" stud Id:" + studID);
	}

	public void getStudentDetails(char studInitial) {
		System.out.println(" Stud initial:" + studInitial);
	}

	public void getStudentDetails(int studID, int contactNum) {
		System.out.println(" stud Id:" + studID);
	}

	public void getStudentDetails(int studID, String StudName) {
		System.out.println(" stud Id:" + studID);
		System.out.println("StudName:"+StudName);
	}
	
	public void getStudentDetails(char studID, String empName) {
		System.out.println(" stud Id:" + studID);
	}
	
	
	public static void main(String[] args) {
		LearnMethodOverloading obj = new LearnMethodOverloading();
		obj.getStudentDetails();
		obj.getStudentDetails('T');
		obj.getStudentDetails(4387);
		obj.getStudentDetails(4345, "Jaya");
	}
	
	

}
