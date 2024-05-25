package com.coreconcepts.superr;

public class Animal3SuperChildConstructor extends Animal3SuperParentConstructor {
	
		Animal3SuperChildConstructor(){  
		super();  
		System.out.println("dog is created");  
		}  
		
		public static void main(String[] args) {
			
			Animal3SuperChildConstructor a3 = new Animal3SuperChildConstructor(); //object
			
		}


}
public class Animal2SuperChildMethod extends Animal2SuperParentMethod {
	
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
	super.eat();  
	bark();  
	eat();
	}  
	
	public static void main(String[] args) {
		Animal2SuperChildMethod a1 = new Animal2SuperChildMethod();
		a1.work();
	}


}
public class Animal3SuperParentConstructor {
	
	Animal3SuperParentConstructor(){
		System.out.println("Animal is created");
	}
	
}
public class Animal2SuperParentMethod {
	
	void eat() {
		System.out.println("eating...");
	}

}
public class Animal1SuperChildVariable extends Animal1SuperParentVariable {
	
	String color="black";
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
	
	public static void main(String[] args) {
		
		Animal1SuperChildVariable a1 = new Animal1SuperChildVariable();
		a1.printColor();
		
	}
}
public class Animal1SuperParentVariable {
	
	String color="white";

}
