package com.aurionpro.structural.Adapter.model;

public class HatAdaptor implements IItem {

	private Hat hat;
	
	
	public HatAdaptor(Hat hat) {
		super();
		this.hat=hat;
		
	}

	@Override
	public String getItemName() {
		String name = hat.getShortName()+" - "+hat.getLongName();
		return name ;
	}

	@Override
	public double getItemPrice() {
		double price = hat.getBasicPrice()+hat.getTax()/100;
		
		return price;
	}
	

}
