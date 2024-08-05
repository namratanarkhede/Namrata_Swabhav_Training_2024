package com.aurionpro.ocp.test;

import com.aurionpro.ocp.model.FestivalType;
import com.aurionpro.ocp.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
	    FixedDeposit fd = new FixedDeposit(12345, "John Doe", 10000.0, 2, FestivalType.DIWALI);
        System.out.println(fd.toString());
        System.out.println("Simple Interest: " + fd.calculateSimpleintrest());
	}
}
