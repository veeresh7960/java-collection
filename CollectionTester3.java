package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTester3 {

	public static void main(String[] args) {
		String cadbury = "dairymilk";
		String nestle = "kitcat";
		String campco = "milkybar";
		String parle = "kiss me ";
		String amul = "Dark chocolate";

		Collection chocolates = new ArrayList();
		boolean added = false;
		added = chocolates.add(parle);
		System.out.println(added);
		added = chocolates.add(cadbury);
		System.out.println(added);
		added = chocolates.add(campco);
		System.out.println(added);
		added = chocolates.add(nestle);
		System.out.println(added);
		added = chocolates.add(amul);
		System.out.println(added);

		int total = chocolates.size();
		System.out.println("size of an arry = " + total);

		String hersheys = "kitcat";
		boolean remove = chocolates.remove(hersheys);
		System.out.println("remove = " + remove);
		String ref = null;
		if (ref != null) {
			System.out.println(ref.toString());
		}
		
		added = chocolates.add(null);
		System.out.println("added null: " + added);
		added = chocolates.add(null);
		System.out.println("addednull:" + added);
		boolean remove2=chocolates.remove(null);
		System.out.println("removed dulbicate null:" +remove2);
		
		
		
		
		total = chocolates.size();
		System.out.println("total " + total);

		total = chocolates.size();
		System.out.println("totalElements after adding duplicate: " + total);
		chocolates.remove(parle);
		chocolates.remove(parle);
		total = chocolates.size();
		System.out.println("totalElements: " + total);

		//List chocolateList = new ArrayList();
		System.out.println("looping array");
		Object[] convertedChocoltes = chocolates.toArray();
		for (int i = 0; i < convertedChocoltes.length; i++) {
			System.out.println(convertedChocoltes[i]);
		}
		System.out.println("looping using iterator*****");

		Iterator iterator = chocolates.iterator();
		while (iterator.hasNext()) {
			System.out.println("element present");
			Object str = iterator.next();
			System.out.println(str);

		}
		//contains(obj)
		boolean contains = chocolates.contains(amul);
		System.out.println("contains added : " + contains);
		//chocolates.clear();
		System.out.println("is empty method");
		boolean isempty=chocolates.isEmpty();
		System.out.println("is empty: " + isempty);

	}
}
