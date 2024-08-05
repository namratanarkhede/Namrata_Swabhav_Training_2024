package com.aurionpro.test;
import java.util.function.BiPredicate;
//4. Predicate => Accepts only one argument and return boolean value
//		test()
// BiPredicate
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> evenPredicate = (Integer number) -> (number%2==0);
		
		BiPredicate<Integer, Integer> greaternumberPredicate = (Integer number1, Integer number2) -> (number1>number2);
		
		System.out.println(evenPredicate.test(5));
		System.out.println(greaternumberPredicate.test(4, 6));
	}

}
