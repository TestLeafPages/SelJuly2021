package week3.day2;

public class CalcBusinessTax implements TaxCalculation{

	public double incomeAdd(String name, double amount1, double amount2) {
		System.out.println(" Name of the Business person:" + name);
		double result = (amount1+amount2)/10;
		
		return result;
	}

	public double incomeReduce(String name, double amount1, double amount2) {
		System.out.println(" Name of the Business person:" + name);
		double result = amount1-amount2;
		return result;
	}

	public void publishValue() {
		// TODO Auto-generated method stub
		
	}

	public void taxSlab(int data) {
		// TODO Auto-generated method stub
		
	}



}
