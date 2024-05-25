package com.oop;

public class Main3getterssettersAddfunctionality {
	
	public static void main(String[] args) {
		Car3getterssetterAddfunctinality car = new Car3getterssetterAddfunctinality ();
		car.setSpeed (10);
		car.setDoors ("closed");
		car.setEngine ("on");
		car.setDrivers ("seated");
		//calling the function
		System.out.println (car.run ());
	}

}
public class Main1 {
	
	public static void main(String[] args) {
		Car1 c1= new Car1();
		c1.speed=40;
		System.out.println(c1.speed);
	}

}


public class Main2getterssetters {
	
	public static void main(String[] args) {
		Car2getterssetters c2= new Car2getterssetters();
		c2.setSpeed(40);
		System.out.println(c2.getSpeed());
		
		
		c2.setDoors("Closed");
		System.out.println(c2.getDoors());
		
		
	}

}
public class Car2getterssetters {
	
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	

}
public class Car1 {
	
	private String doors;
	private String engine;
	private String drivers;
	public int speed ;
	
}
public class Car3getterssetterAddfunctinality {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDrivers(String drivers) {
		this.driver = drivers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
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
