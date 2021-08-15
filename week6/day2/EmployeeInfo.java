package week6.day2;

public class EmployeeInfo {
	String empName;
	String empId;
	static String compName;
	
	public void setValues(String name, String id, String company) {
		empName = name;
		empId = id;
		compName = company;

	}
	
	public void printValues() {
		System.out.println(empName+" "+empId+" "+compName);

	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		/*
		 * EmployeeInfo emp1 = new EmployeeInfo();
		 * emp1.setValues("Hari","100","TestLeaf"); emp1.printValues();
		 * 
		 * EmployeeInfo emp2 = new EmployeeInfo();
		 * emp2.setValues("Prasad","200","TestLeaf Software Solutions");
		 * 
		 * System.out.println("***********************");
		 * 
		 * emp1.printValues(); emp2.printValues();
		 */
		
		staticMethod();
		

	}

}
