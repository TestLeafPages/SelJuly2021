package seleniumSample1;

public class FindIntersection {
	public static void main(String[] args) {
	     int [] arr= {2,4,6,5,8,9};
	     int [] arr1= {1,2,3,8,9,10};
	     
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<arr1.length;j++)
	    	 {
	    		 if(arr[i]==arr1[j])
	    		 {
	    			 System.out.println("The intersection is " +arr[i]);
	    			 
	    			 
	    		 }
	    	 }
	     }
	    
		
	}
}


