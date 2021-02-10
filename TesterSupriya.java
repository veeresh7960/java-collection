package com.xworkz.celebration.optional;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TesterSupriya {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>((a, b) -> b.compareToIgnoreCase(a));
		map.put("Good morning ", " Allok");
		map.put(" just math matalli", "Ragu diksith");
		map.put(" sun ra hain ", "Shreya goshal");
		map.put(" kali qutru", " Vijay Prakash");

		Set<Entry<String, String>> entryset = map.entrySet();
		entryset.forEach(entry -> System.out.println("Song is : " + entry.getKey() + " Singer is:" + entry.getValue()));

		map.forEach((k, v) -> System.out.println(k + " " + v));

		// values are always String and deal with file
		// this properties are used most in file
		Properties properties = new Properties();
		properties.setProperty(" ramesh", "veeresh@gmail.com");
		String property = properties.getProperty("veeresh");

		System.out.println(property);

	}

}
