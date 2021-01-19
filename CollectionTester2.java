package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTester2 {

	public static void main(String[] args) {
		String samsung = "galaxy";
		String oppo = "oppf11 pro";
		String poco = "pocof1";
		String apple = "iphonex";
		Collection mobiles = new ArrayList();
		mobiles.add(apple);
		mobiles.add(poco);
		mobiles.add(oppo);
		mobiles.add(samsung);

		int total = mobiles.size();
		System.out.println("total number of mobiles = " + total);
		System.out.println(mobiles);

	}

}
