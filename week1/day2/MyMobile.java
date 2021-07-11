package week1.day2;

// State - variables

//Decide the state of the Phone (variables/properties)
/*
* int,char,float,long,String,boolean
* 
* screenSize,cost, logo, amps,numberIME, brand, isTouch 
*/

//Decide the behavior of the Phone( actions/methods)

/* makeCalls(), payMoney(), sendSMS(), viewGallery()
 * setAlarm(), readNews(), swithON(),switchOff()
* 
*/

/*
 * syntax / Method Signature :
 * public void makeCalls()
 * 
 * public : Access Modifier/Specifier
 * void   : return type
 * makeCalls : methodName
 * ()     : input arguments
 * 
 * Access Modifier:
 * 
 * public : Class components can be accessed any where inside the whole project
 * private: 
 * protected: 
 * package:
 * 
 * 
 * 
 */

/*
 * Passing arguments and returning variables
 * 
 * 
 * 
 */
public class MyMobile {

	// variables/state
	// Instance variable
	int screenSize = 12;
	int cost = 50000;
	char logo = 'S';
	float amps = 1.5f;
	long mobileNumber = 9941341711L;
	boolean isTouch = true;
	String brand = "Galaxy";

	// Behaviours
	public void makeCalls() {
		System.out.println(" Making calls");
	}

	private void payMoney() {
		System.out.println(" Money Payment done");
	}

	public void viewGallery() {
		System.out.println("Beautiful pics seen");
	}

	// Passing arguments
	public void sendSMS(String sms) {
		// TODO Auto-generated method stub
		System.out.println("sms");
		System.out.println(sms);
	}

	public void setAlarm(double d) {
		// TODO Auto-generated method stub
		System.out.println(" Alarm time");
		System.out.println(d);
	}

	// Returning the variables
	// void - empty - return nothing
	public int getCost() {
		System.out.println(cost);
		return cost;
	}

	public boolean isTouchScreen() {
		System.out.println(isTouch);
		return isTouch;
	}

	public static void main(String[] args) {
		// access all the components of the class
		// create an object
		// Instatntaite an object

		// syntax:
		// className object= new className()--constructor;
		// a class can have any number of objects
		// components of class accessed only thr object
		MyMobile mobObj = new MyMobile();
		// MyMobile mobObj1 = new MyMobile();
		// MyMobile mobObj2 = new MyMobile();
		// ctrl+2 l

		float amps2 = mobObj.amps;
		System.out.println(" Amps:" + amps2);
		System.out.println(mobObj.screenSize);
		int myScreenSize = mobObj.screenSize;
		boolean isTouch2 = mobObj.isTouch;
		System.out.println(" isTouch2:" + isTouch2);

		// access the method using the object
		mobObj.makeCalls();
		mobObj.viewGallery();
		mobObj.payMoney();

		mobObj.sendSMS("Haapy Selenium");
		mobObj.setAlarm(1.00);
		
		// returning the value
		int costOfMobile = mobObj.getCost();
		System.out.println("costOfMobile:" + costOfMobile);
		
		System.out.println(mobObj.getCost());
		mobObj.getCost();
	}

}
