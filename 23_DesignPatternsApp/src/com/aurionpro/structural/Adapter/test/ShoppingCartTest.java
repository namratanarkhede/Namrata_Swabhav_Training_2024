package com.aurionpro.structural.Adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structural.Adapter.model.Biscuit;
import com.aurionpro.structural.Adapter.model.Hat;
import com.aurionpro.structural.Adapter.model.HatAdaptor;
import com.aurionpro.structural.Adapter.model.IItem;
import com.aurionpro.structural.Adapter.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		//ShoppingCart cart = new ShoppingCart(new ArrayList<>());
		
		ShoppingCart cart = new ShoppingCart(new ArrayList<>());
		IItem biscuit = new Biscuit("Oreo", 100);
		IItem biscuit1 = new Biscuit("JIM-JAM", 20);
		
		Hat hat = new Hat("Hat", "HatName", 200, 12);
		IItem hatAdaptor = new HatAdaptor(hat);
		
		cart.addItemtoCart(biscuit1);
		cart.addItemtoCart(biscuit);
		cart.addItemtoCart(hatAdaptor);
		
		System.out.println("\n Items In Cart :");
		System.out.println("\n |Item              | Price |");
		List<IItem> items = cart.getCartItems();
		for(IItem item: items) {
			System.out.println( "\n |"+item.getItemName()+ "           | "+ item.getItemPrice()+ "   |");
			
		}
		
		double totalPrice = cart.getCartPrice();
		System.out.println("\n Total Price : $ " +totalPrice);
		
	}
}
