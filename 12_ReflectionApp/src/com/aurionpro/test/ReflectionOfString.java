package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getPackage());
		System.out.println(stringClass.getSuperclass());
	

		System.out.println("Methods");
		
		Method stringMethods[] = stringClass.getMethods();
		for(Method method : stringMethods) {
			System.out.println(method.getName()+ "\t" + method.getParameterCount());
		
		}
		
		System.out.println("\nConstructors");
		
		Constructor stringConstructor[] = stringClass.getConstructors();
		for(Constructor constructor : stringConstructor) {
			Parameter parameters[] = constructor.getParameters();
			for(Parameter parameter: parameters) {
				System.out.println(constructor.getName() +"\t" +parameter.getName());
			}
		
		}

		
		System.out.println("\n Integers");
		Class intClass = Class.forName("java.lang.Integer");
		System.out.println(intClass.getName());
		
	}
}
