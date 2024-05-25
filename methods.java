package com.methods;

public class MethodOverloadingDiffrenceInOrderofparameters {
	
	public static void main(String[] args) {
		
		MethodOverloadingDiffrenceInOrderofparameters m1 = new MethodOverloadingDiffrenceInOrderofparameters();
		m1.orderParameters(10,"Ajay");
		m1.orderParameters("Ajay", 10);
		
	}
	
	public void orderParameters(int id,String name){
		System.out.println("id:" + id + "name:" + name);
	}	
 
	public  void orderParameters(String name,int id){
		System.out.println("id:" + id + "name:" + name);
	}

}
public class MethodOverloadingwithDifferentDataTypesofParameter {
	
	
	public static void main(String[] args) {
		System.out.println("1+2=" + sum(1,2));
		System.out.println("1+2.5=" + sum(1,2.5f));
		System.out.println("1.3+2.5=" + sum(1.3,2.5));
	}

	private static int sum(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("Adding two integers entity");
		return i+j;
	}
	
	private static float sum(int i, float d) {
		// TODO Auto-generated method stub
		System.out.println("Adding one integer with one float entity");
		return i+d;
	}
	
	
	private static double sum(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println("Adding one double with one double entity");
		return d+e;
	}
}
public class MethodOverloadingwithDiffNoOfparameters {
	
	public static void main(String[] args) {
		System.out.println("Area of reactangle " + area(14.25d,10.65d));
		System.out.println("Area of square " + area(5.0d));
	}

	

	public static double area(double length, double width) {
		// TODO Auto-generated method stub
		return (length*width);
	}
	
	public static double area(double side) {
		// TODO Auto-generated method stub
		return side*side;
	}
	}
public class MethodwithoutParametersNoReturnType1 {
	
	public static void main(String[] args) {
		loop();
	}
	
	public static void loop() {
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	}
public class MethodwithParametersWithReturnType22 {
	
	public static void main(String[] args) {
		
		System.out.println("Area of Reactangle with length=5.4" + "and width =3.2");
		double area=areaReactangle(5.4,3.2);
		System.out.println(area);
		
	}

	public static double areaReactangle(double length, double width) {
		// TODO Auto-generated method stub
		return (length*width);
	}

}
public class MethodwithParameterNoReturnType2 {
	
	public static void main(String[] args) {
		System.out.println("Area of Reactangle with length=5.4" + "and width =3.2");
		areaReactangle(5.4,3.2);
	}

	public static void areaReactangle(double length, double width) {
		// TODO Auto-generated method stub
		
		System.out.println(length*width);
		
	}

}
public class MethodwithParametersNoReturnType1 {
	
	public static void main(String[] args) {
		loop(1,10);
	}
	
	public static void loop(int step , int finalvalue) {
		
		while(step<=finalvalue) {
			System.out.println(step);
			step++;
		}
		
	}

}


