package com.xworkz.celebration.optional;

import java.util.Optional;

public class TesterSahana {
public static void main(String[] args) {
	String email="veeresh";
	System.out.println(email);
	 
	if (email!=null) {
		System.out.println(email.toUpperCase());
	}
	
	
	// if object is present true otherwise false
	Optional<String> optional = Optional.of("sahana@gmail.com");
	boolean present = optional.isPresent();
	System.out.println(present);
	
	// it will return optional instance or empty value
	Optional<Integer>yearOptional = Optional.empty();
	System.out.println(yearOptional.isPresent());
	
	yearOptional.ifPresent((v) -> System.out.println(v));
	
	Optional<String> country = Optional.ofNullable("India");
	country.ifPresent(e -> {
		String value = country.map(String::toUpperCase).get();
		System.out.println(value);
		
	});

	String def = country.orElse("Srilanka");
	System.out.println(def.isEmpty());
	System.out.println(def);
	
	
	
	
} 
	
}
