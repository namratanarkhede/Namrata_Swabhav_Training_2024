package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Abnormal conditions that arises during execution of code Error at runtime/Runtime errors
//Exception handling 

//1. try -> The code you want to monitor for an exception.
// find out the situation of error. make object of exception and throw exception.
// form one try block more than one exception can occur

//2. catch -> The code to handle exception.
//we can write more than one catch block to catch each exception.
//we write the code who handle the exception which comes in try block.

//3. throws -> it is used to declare exception that might arise in a method

//4. throw -> used to throw an exception explicitly

//5. finally -> It executes always. Exception arrives or not.
//closing activities. finally block must we write after all catch block.

//every try has at least one catch or finally block.
//try can have more than one catch block and a finally block.

//Exception Hierarchy
//Throwable
//1.Error
//2.Exception
// --- Checked Exception -> Exception which we must handle. compile time exception.
//FileNotFoundException , IOException, ClassNotFoundException
// --- Unchecked Exception -> Not compulsory to handle.
public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			
			double result = number1/number2;
			System.out.println("Division is : "+ result);
		}

		catch(ArithmeticException e){
			System.out.println("Invalid Input for number2. i.e Number2 cannot be 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Enter the required Value");
		}
		catch(NumberFormatException e) {
			System.out.println("Please Enter the Number Value.");
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("Inside Finally.");
		}
		FileInputStream filestream = new FileInputStream("1.txt");
		System.out.println("ExceptionHandling performed");
	}

}
