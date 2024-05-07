package com.coreconcepts.exceptionhandling;

public class Exception1 {
	
	public static void main(String[] args) {
		
		

		    try {
		    	
		    	 // code that generate exception
		        int divideByZero = 5 / 0;
		        System.out.println("Rest of code in try block");
				
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException => " + e.getMessage());

			}
	}

}
public class MultipleCatchBlock1 {
	
	 public static void main(String[] args) {  
         
         try{    
              int a[]=new int[5];    
               a[13]=30/0;    
             }    
         
         catch(ArrayIndexOutOfBoundsException e)  
         {  
          System.out.println("ArrayIndexOutOfBounds Exception occurs");  
         }
			/*
			 * catch(ArithmeticException e) {
			 * System.out.println("Arithmetic Exception occurs"); }
			 */
           catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }            
             System.out.println("rest of the code");    
  }  
} 
import java.io.IOException;  

public class Testthrows1 {
	
	  void m()throws IOException{  
		    throw new IOException("device error");//checked exception  
	  }
	  
	  void n()throws IOException{  
		    m();  
		  }
	  
	  
	  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
	  }
	  
	  
		  public static void main(String args[]){  
		   Testthrows1 obj=new Testthrows1();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
}
