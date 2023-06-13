package org.tnsif.enumeration;

public enum Size implements Pizaa {
SMALL,MEDIUM,LARGE;

@Override
public void display() {

	System.out.println("size:"+this);
}
}
