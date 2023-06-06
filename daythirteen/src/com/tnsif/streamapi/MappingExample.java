package com.tnsif.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MappingExample {
	
	public static void  main(String[] args) {
		List<String> obj= Arrays.asList("tushar","aryan","mihir");
		obj.stream().map(i->i.length()).forEach((i)->System.out.println(i+""));
		
	}

}
