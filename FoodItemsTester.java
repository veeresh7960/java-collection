package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class FoodItemsTester {

	public static void main(String[] args) {
		String chats = "Panipuri";
		String sweet = "Gulamjamoon";
		String riceItem = "GeeRice";
		String Rotti = "JoladaRotti";
		String tiffin = "Dose";
		 Collection foodItems =new ArrayList();
		 boolean added=false;
		 added = foodItems.add(chats);
		 System.out.println("added chats : " + added);
		 added = foodItems.add(sweet);
		 System.out.println("added sweet:" + added);
		 added = foodItems.add(riceItem);
		 System.out.println("added riceItem : " + added);
		 added = foodItems.add(Rotti);
		 System.out.println("added Rotti : " + added);
		 added = foodItems.add(tiffin);
		 System.out.println("added tiffin : " + added); 
		 System.out.println("all type food is avilable");
		 System.out.println (  foodItems instanceof ArrayList);
		 if (sweet instanceof String ) {
			 
			System.out.println(" food is present ");
		}
			
		}
		 
		 

	}


