package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> obj= Arrays.asList("tushar","aryan","mihir");
		obj.stream().filter((i)->i.length()>4).forEach((i)->System.out.println(i+" "));
	
		System.out.println("-----------");
		obj.stream().distinct().forEach((i)->
		System.out.println(i+" "));
		
		System.out.println("-----------");
		obj.stream().limit(2).forEach((i)->
		System.out.println(i+" "));
		
		System.out.println("-----------");
		obj.stream().skip(3).forEach((i)->
		System.out.println(i+" "));
	}

}
