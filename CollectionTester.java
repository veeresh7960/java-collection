package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTester {

	public static void main(String[] args) {

		String cadbury = "dirymilk";
		String nestle = "kitkat";
		String hersheys = "hersheys kisses";
		String parle = "kiss me";
		String amul = "Dark chocolate";

		Collection chocolates = new ArrayList();

		chocolates.add(cadbury);
		chocolates.add(nestle);
		chocolates.add(hersheys);
		chocolates.add(parle);
		chocolates.add(amul);

		int total = chocolates.size();
		System.out.println("total number of objects = " + total);
		System.out.println(chocolates);

	}

}
