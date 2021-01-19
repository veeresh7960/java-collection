package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class PhoneNumberTester {

	public static void main(String[] args) {
		String mobileNo = "9945187254";
		long personalMobileNO = 9945127254l;
		String frindMobileNo2 = "9945182354";
		String frindMobileNo3 = "9945112354";
		String frindMobileNo4 = "9945123454";
		String frindMobileNo5 = "9945134254";
		String frindMobileNo6 = "9945187324";
		String frindMobileNo7 = "9945182354";
		String frindMobileNo8 = "9945186554";
		Collection phoneNo=new ArrayList();
		boolean added=false;
		added=phoneNo.add(mobileNo);
		System.out.println("added :" + added);
		
	}

}
