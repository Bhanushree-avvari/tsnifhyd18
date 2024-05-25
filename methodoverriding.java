package com.methodoverriding;

public class InstanceoveridingTest {
	
	public static void main(String[] args) {
		//Parent p1 = new Parent();
		//p1.show();
		
		Parent p2 = new Child();
		p2.show();
		
	}
	

}
public class StaticoverridingTest {
	
	public static void main(String[] args) {
		
		Parent obj2 = new Child();
		obj2.print();
		
	}

}
public class Child extends Parent{
	
	public void show() {
		System.out.println("Child Show() is called");
	}
	
	//Static method
	public static void print() {
		System.out.println("Child static print() is called");
	}

}
public class Parent {
	
	//Instance method
	public void show() {
		System.out.println("Parents show() is called");
	}
	
	//Static method
	public static void print() {
		System.out.println("Parent static print() is called");
	}
}
