//Program to demonstrate on stream
package com.tnsif.streamapi;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer>s1=Stream.of(11,23,45,12,23);
		s1.forEach((i)-> System.out.println(i+""));
	}

}
