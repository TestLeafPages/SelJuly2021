package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {

		Car c= new Car();
		int wheelCount = c.wheelCount;
		System.out.println("wheelCount:" + wheelCount);
		c.applyBrake();
		c.isAirBagAvailable();
		c.startEngine();
		c.reverseGear();
		c.wipeMirror();
		
		System.out.println(" BMW");
		BMW b = new BMW();
		int wheelCount2 = b.wheelCount;
		b.applyBrake();
		b.isAirBagAvailable();
		b.reverseGear();
		b.startEngine();
		b.wipeMirror();
		
		System.out.println("Audi");
		Audi a =  new Audi();
		a.wipeMirror();
		a.reverseGear();
		
		System.out.println("Bajaj");
		Bajaj bj = new Bajaj();
		int autoWheels = bj.autoWheels;
		System.out.println("wheelCount:" + autoWheels);
		bj.applyBrake();
		bj.startEngine();
		bj.reverseGear();
		bj.wipeMirror();
		bj.applyBrake();
		
		
		
		
		
	}

}
