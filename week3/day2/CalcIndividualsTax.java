package week3.day2;

import week3.day1.LearnMethodOverloading;

public class CalcIndividualsTax extends LearnMethodOverloading implements TaxCalculation,IncomeCalculation  {
		 
	public double incomeAdd(String name, double amount1, double amount2) {
		System.out.println(" Name of the individual:" + name);
		double result = amount1+amount2;
		return result;
	}

	public double incomeReduce(String name, double amount1, double amount2) {
		System.out.println(" Name of the individual:" + name);
		double result = amount1-amount2;
		return result;
	}

	public void publishValue() {
		System.out.println(" Results published for individual");
	}

	
	// Own methods of that class can also be included
	public void ownMthdIndiv() {
		System.out.println("ownMthdIndiv");
	}

		
	// UNIMPLEMENTED METHODS OF THE SECOND INTERFACE
	public void calcGrossIncome() {
		// TODO Auto-generated method stub
		
	}
	public void removeDeductions() {
		// TODO Auto-generated method stub
		
	}

	// from tax interface
	public void taxSlab() {
		// TODO Auto-generated method stub
		
	}

	// from income interface
	public void taxSlab(int data) {
		// TODO Auto-generated method stub
		
	}
	

}
