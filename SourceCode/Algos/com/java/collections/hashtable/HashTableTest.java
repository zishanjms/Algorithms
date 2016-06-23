package com.java.collections.hashtable;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		
		Hashtable obj = new Hashtable();
		obj.put("A", new Integer(3));
		obj.put("B", new Integer(2));
		obj.put("C", new Integer(8));
		obj.clear();
		System.out.println("Obj size: "+obj.size());

	}

}
