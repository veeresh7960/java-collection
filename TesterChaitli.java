package com.xworkz.celebration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesterChaitli {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		String name = "Elon musk";
		int age = 49;
		map.put(name, age);
		map.put("steve job", 40);
		map.put("veeresh", 23);
		map.put("kalam", 83);
		map.put("doddappa", 45);
		map.put("eranna", 70);
		map.put("yash", 35);
		map.put(null, null);
		map.put("hanumesh", null);
		System.out.println(map.size());
		
		Integer value = map.get("yash");
		System.out.println(value);
		Set<String> keys=map.keySet();
		keys.forEach(anything->{
			Integer v = map.get(anything);
			System.out.println(anything + "age is" + v);
		});
		Collection<Integer>values=map.values();
		values.forEach(a->System.out.println(a));
		Set<Entry<String , Integer>>entryset=map.entrySet();
		System.out.println(entryset.size());
		entryset.forEach(r->{
			System.out.println(r.getKey());
			System.out.println(r.getValue());
			});
				
			
			
		}

}


