package week3.day2;

//desogn/pan/template
public interface TaxCalculation {
	// No body/implementation for the methods
	// Only method signature is provided
	
	// unimplmented methods
	
	// documentation
	/**
	 * This method adds up all the incomes of an indivudual/business/corporate
	 * @param name : name of the indivudual/business/corporate
	 * @param amount1 : income1
	 * @param amount2  : income2
	 * @return
	 */
	
	public double incomeAdd(String name, double amount1, double amount2);
	/**
	 * 
	 * @param name 
	 * @param amount1
	 * @param amount2
	 * @return
	 */
	public double incomeReduce(String name, double amount1, double amount2);
	/**
	 * 
	 */
	public void publishValue();
	
	public void taxSlab(int data);
	

}
