package com.aurionpro.ocpviolation.model;

public class CalculateSimpleIntrest {
	private FixedDeposit fd;
	
	public CalculateSimpleIntrest(FixedDeposit fd) {
		super();
		this.fd = fd;
	}

	public double simpleIntrest() {
        double interestRate = fd.getFestival().getInterestRate();

		return (fd.getPrincipal()*fd.getDuration()*interestRate)/100;
	}
}
