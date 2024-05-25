package com.coreconcepts.userinput;

import java.util.*;

//import java.math.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ReadBigIntegerDecimal {
	
	public static void main(String[] args) {

	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a big integer: ");

	    // reads the big integer
	    BigInteger value1 = input.nextBigInteger();
	    System.out.println("Using nextBigInteger(): " + value1);

	    System.out.print("Enter a big decimal: ");

	    // reads the big decimal
	    BigDecimal value2 = input.nextBigDecimal();
	    System.out.println("Using nextBigDecimal(): " + value2);

	    input.close();
	  }

}
import java.util.*;
public class ReadWord {
	
	public static void main(String[] args) {

	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your name: ");

	    // reads the entire word
	    String value = input.next();
	    System.out.println("Using next(): " + value);

	    input.close();
	  }

}
import java.util.*;

public class ReadDouble {
	
	public static void main(String[] args) {

	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Double value: ");

	    // reads the double value
	    double value = input.nextDouble();
	    System.out.println("Using nextDouble(): " + value);

	    input.close();
	  }

}
import java.util.Scanner;

public class ReadInteger {
	
	public static void main(String[] args) {

	    // creates a Scanner object
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter an integer: ");

	    // reads an int value
	    int data1 = input.nextInt();

	    System.out.println("Using nextInt(): " + data1);

	    input.close();
	  }

}
import java.util.Scanner;

public class ReadLine {
	
	public static void main(String[] args) {

	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter your name: ");

	    // takes input from the keyboard
	    String name = input.nextLine();

	    // prints the name
	    System.out.println("My name is " + name);

	    // closes the scanner
	    input.close();
	  }

}

