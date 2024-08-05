package com.aurionpro.operator.types;

// perform logical operation like "Logical AND", "logical OR"
// { logical AND: && , logical OR : || , logical NOT : !}
public class LogicalOperator {
	public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        System.out.println("Logical AND operation is given as = a && b: " + (a && b));  // return true if both condition are true
        System.out.println("Logical OR operation is given as = a || b: " + (a || b));  // return true at least one condition is true
        System.out.println("Logical NOT operation is given as = !a: " + (!a));          
        // return true when condition is false and vice-versa
    }


}
