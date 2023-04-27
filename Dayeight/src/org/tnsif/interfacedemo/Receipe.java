package org.tnsif.interfacedemo;
//program to demonstrate functional interface
@FunctionalInterface
public interface Receipe {
/*by default all the methods inside an 
 * interface are public abstract and variable are
 * public static final*/
	
	//abstract method
	String displayName();
}

