package com.aurionpro.structural.Adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<IItem> cartItem;

	public ShoppingCart(List<IItem> cartItem) {
		super();
		this.cartItem = cartItem;
	}
	
	public void addItemtoCart(IItem item) {
		cartItem.add(item);
		System.out.println("Added to cart : "+ item.getItemName()+ " Price: $ "+ item.getItemPrice() );
		
	}
	
	public List<IItem> getCartItems(){
		return cartItem;
		
	}
	public double getCartPrice() {
		
		return cartItem.stream().mapToDouble(item -> item.getItemPrice()).reduce(0, (item1,item2) -> item1+item2);
		
	}

}
