package week1.day1;

public class DataParameterization {
	
	public void sum(int x,int y) {
	//	int x = 10;
	//	int y = 20;
				
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		DataParameterization dp = new DataParameterization();
		
		dp.sum(50,10);

	}

}
