package com.aurionpro.ocp.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	
	public FestivalType type;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FestivalType getType() {
		return type;
	}

	public void setType(FestivalType type) {
		this.type = type;
	}

	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType type) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.type =type;
		
	}

	public double getIntrestRate() {
		switch(type){
			case NEWYEAR:
				return 8.5;
			case DIWALI:
				return 8;
			case HOLI:
				return 7.5;
			case OTHER:
				return 6.5;
			default:
                throw new IllegalArgumentException("Invalid Festival Type");
		}
	}
	

	public double calculateSimpleintrest() {
		  double rate = getIntrestRate();
	      return (this.principal * this.duration * rate) / 100;
	 }

	
	

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", type=" + type + "]";
	}
	
	

}
