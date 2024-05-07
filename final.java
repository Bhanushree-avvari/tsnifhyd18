package com.coreconcepts.finall;
public final class FinalBike {
}
public class FinalExtends extends FinalBike{
	void run() {
		System.out.println("Running safely with 100kmph");
	}
		public static void main(String[] args) {
		FinalExtends f1 = new FinalExtends();
		f1.run();
		}
}
public class FinalMethod1 {
		final void run() {
		System.out.println("Running");
	}
}
public class FinalMethodMain extends FinalMethod1{
	void run() {
		System.out.println("Running safely with 100kmph");
	}
public static void main(String[] args) {
		FinalMethodMain f1 = new FinalMethodMain();
		f1.run();
	}
}
public class FinalVariable {
	final int speedlimit=90; // constant
	void run() {
		speedlimit=125;
	}
public static void main(String[] args) 
{
		FinalVariable obj = new FinalVariable();
		obj.run();
}
}
