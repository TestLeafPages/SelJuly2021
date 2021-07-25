package week3.day2;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcIndividualsTax indiv = new CalcIndividualsTax();
		
		
		double incomeAdd = indiv.incomeAdd("John", 4567.67, 329489.54);
		double incomeReduce = indiv.incomeReduce("John", 879779, 6789);
		System.out.println("incomeAdd" + incomeAdd);
		System.out.println("incomeReduce:"+incomeReduce);
		indiv.publishValue();
		indiv.ownMthdIndiv();
		
		indiv.getStudentDetails('J');
		
		// Object instantiation cannot be done for Interface
		// TaxCalculation tax = new TaxCalculation();
		
		CalcCorporateTax corp = new CalcCorporateTax();
		corp.display();
		corp.incomeAdd(null, incomeAdd, incomeReduce);
		corp.incomeReduce(null, incomeAdd, incomeReduce);
		corp.publishValue();

		
		
	}

}
