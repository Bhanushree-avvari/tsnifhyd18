package com.coreconcepts.filehandling;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("filename1.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
			} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
			}
	}
}
import java.io.File;
public class DeleteFile {
	public static void main(String[] args) {
		File myObj = new File("filename1.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	}
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("filename1.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
	} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();}
	}
}
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
	public static void main(String[] args) {
		try {
			 FileWriter myWriter = new FileWriter("filename1.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
        }
	}
}


