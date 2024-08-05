package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializationExample
{
    public static void main(String[] args)
    {   
    	String filename = "D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test3";

	    Student object1 = null;
	
        try
        {   
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            object1 = (Student)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
            System.out.println("studentRollNo = " + object1.studentRollNo);
            System.out.println("studentName = " + object1.studentName);
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
 
    }
}