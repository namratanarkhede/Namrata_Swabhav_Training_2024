package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//reduce : used to add the all element of the arraylist
//we can do one operation on stream


public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20,30,15,37);
		
//		Stream<Integer> numberStream = numbers.stream();
//		numberStream.forEach((number)->System.out.println(number));
		System.out.println("All numbers");
		numbers.stream()
			.forEach((number)-> System.out.println(number));
		
		System.out.println("Odd Numbers");
		List<Integer> filteredNumbers = numbers.stream()
			.filter((number)->(number%2 !=0))
			.filter((number) -> (number <20))
			.collect(Collectors.toList());
//			.forEach((number)->System.out.println(number))
		
			
		filteredNumbers.stream()
			.forEach((number)->System.out.println(number));
		
		
		System.out.println("Squared Number");
		List<Integer> squareNumbers = numbers.stream()
				.map((number) -> number*number)
				.collect(Collectors.toList());
		
		squareNumbers.stream()
			.forEach((number)->System.out.println(number));
		
		
		int sum = numbers.stream()
				.reduce(0,(number1,number2)->number1+number2);
		System.out.println("Sum of all element is : "+sum);
		
		List<Integer> sortedNumbers = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		
		
		System.out.println("Sorted array list :");
		sortedNumbers.stream()
		.forEach((number)->System.out.println(number));
		
		//decending order
		List<Integer> reversedNumbers = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.limit(2)
				.collect(Collectors.toList());
		System.out.println("Decending method 1:");
		reversedNumbers.stream()
		.forEach((number)->System.out.println(number));
		
//		Collections.reverse(numbers);
//		
//		System.out.println("decending method :3" + numbers);
	
//		System.out.println("Decending method: 2 ");
//		sortedNumbers.stream().sorted(Integer::compare).forEach(System.out::println);
	
		Optional<Integer> maxNumber = numbers.stream().max((number1, number2)->number1-number2);
		if(maxNumber.isPresent()) {
			System.out.println("MaxNumber = "+maxNumber.get());
		};
//		Optional<Integer> minNumber = numbers.stream().min((number1, number2)->number2-number1);
//		if(minNumber.isPresent()) {
//			System.out.println("MinNumber = "+minNumber.get());
//		};
		Optional<Integer> minNumber2 = numbers.stream().min((number1, number2)->number1-number2);
		if(minNumber2.isPresent()) {
			System.out.println("MinNumber2 = "+minNumber2.get());
		};
		
		
		
	}
	

}
