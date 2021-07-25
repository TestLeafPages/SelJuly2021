package week3.day2;

public interface IncomeCalculation {
	/**
	 * 
	 */
	void calcGrossIncome(); // add all HRA,LTA, spl allowance
	/**
	 * 
	 */
	void removeDeductions();// to remove deductions
	public void taxSlab();
}
