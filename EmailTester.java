package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class EmailTester {

	public static void main(String[] args) {

		String s1 = "veeresh@gmail.com";
		String s2 = "veeresh@gmail.com";
		String s3 = "varsha.xworkz@gmail.com";
		String s4 = "uk20.xworkz@gmail.com";
		String s5 = "sushma98.xworkz@gmail.com";
		String s6 = "surakshita.xworkz@gmail.com";
		String s7 = "sinchanaxwork@gmail.com";
		String s8 = "siddharthagupta.xworkz@gmail.com";
		String s9 = "hriraksha.xworkz@gmail.com";
		String s10 = "vishalaxi.xworkz@gmail.com";

		Collection emails = new ArrayList();
		boolean added = false;
		added = emails.add(s1);
		System.out.println("s1 added : " + added);
		added = emails.add(s2);
		System.out.println("s2 added : " + added);
		boolean remove =emails.remove(s2);
		System.out.println("removed dublicate email : "+ remove);
		String s11="arun@gmail.com";
		boolean extra = emails.remove(s11);
		System.out.println("removed s11 added : " + extra);
         added =emails.add(s11);
		added = emails.add(s3);
		System.out.println("s3 added : " + added);
		added = emails.add(s4);
		System.out.println("s4 added : " + added);
		added = emails.add(55);
		System.out.println("s5 added : " + added);
		added = emails.add(s6);
		System.out.println("s6 added : " + added);
		added = emails.add(s7);
		System.out.println("s7 added : " + added);
		added = emails.add(s8);
		System.out.println("s8 added : " + added);
		added = emails.add(s9);
		System.out.println("s9 added : " + added);
		added = emails.add(s10);
		System.out.println("s10 added : " + added);
		int total=emails.size();
		System.out.println("total no of emails : " + total);
		
		
		
		
 System.out.println("total no emails :" +total);
	}

}
