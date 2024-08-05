package com.aurionpro.test;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
//		Guitar whatErinLinkes = new Guitar("", "fender", "Stratocastor", "electric", "alder", "alder", 0);
		Guitar whatErinLinkes = new Guitar("123",Builder.FENDER, "IDK", Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 2000);

		List matchGuitars = inventory.search(whatErinLinkes);
		if(!matchGuitars.isEmpty()) {
			System.out.println("Erin, you might like this");
			for(Iterator i= matchGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				System.out.println("   We have a " 
				+ guitar.getBuilder() + " " +guitar.getModel() + " " 
				+ guitar.getType()+ "Guitar : \n " + guitar.getBackWood()+ " back and sides.\n" 
				+ guitar.getTopWood() + "top.\n You can have it for only $" + guitar.getPrice()+ ".");
			}
		}else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		
	}

}
