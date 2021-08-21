package week7.day1;

public class EmployeeInfo {
	
	int empId;
	String empName;
	
	//default constructor
	public EmployeeInfo(){
		this(100,"Hari");
		System.out.println("default constructor");
	}
	
	//parameterized constructor
	public EmployeeInfo(int empId, String empName) {
		//this();
		
		System.out.println("Parameterized Constructor");
		this.empId = empId;
		this.empName = empName;
		
	}

	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		
		System.out.println(emp.empId+" "+emp.empName);
		
		

	}

}
