package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//In serialization the object is converted into the bytes stream so that it easliy stored in file or memory or database.
//The ObjectOutputStream class contains writeObject() method for serializing an object
//to make a java object serializable we implement the java.io.Serializable interface
public class SerializationExample {
	public static void main(String[] args) {
		Student object = new Student(1, "Nams");
		String filename = "D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test3";
		try
	    {
			FileOutputStream file = new FileOutputStream(filename);
	        ObjectOutputStream out = new ObjectOutputStream(file);
	             
	        out.writeObject(object);
	             
	        out.close();
	        file.close();
	             
	        System.out.println("Object has been serialized");
	 
	     }
		catch(IOException ex)
	    {
	        System.out.println("IOException is caught");
	    }
	}
}
