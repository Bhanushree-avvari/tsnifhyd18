package com.oop1.constructor;
public class Car1Main {
	
	public static void main(String[] args) {
		Car1Default c1 = new Car1Default();
		System.out.println(c1.run());
	}

}
public class Car {
	
	public Car() {
		
		//Code block constructor general
	}

}
public class DefaultConstructoruserAdded {
	
	private String brand;
	
	public DefaultConstructoruserAdded(String ibrand) {
		brand=ibrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public static void main(String[] args) {
		
		DefaultConstructoruserAdded phone = new DefaultConstructoruserAdded("Nokia");
		System.out.println (phone.getBrand ());
	}

}
public class NoConstructorMain {
	
	public static void main(String[] args) {
		NoConstructor n1 = new NoConstructor();
		System.out.println(n1.getBrand());
	}

}
public class NoConstructor {
	
	private String brand = "samsung";
	
	public String getBrand() {
		return brand;
	}

}
public class Car2Main {
	
	public static void main(String[] args) {
		Car2Parametrized c2 = new Car2Parametrized("closed"	, "on", "seated", 10);
		
		System.out.println(c2.run());
	}

}
public class Car2Parametrized {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
 
	//Parameterized constructor
	public Car2Parametrized(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}

}
public class Car1Default {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car1Default() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}

}

