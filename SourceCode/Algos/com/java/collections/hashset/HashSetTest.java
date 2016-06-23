package com.java.collections.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Hans");
		set.add("Lotte");
		set.add("Jane");
		set.add("Hans");
		set.add("Jane");
		
		System.out.println("size of set" + set.size());

	}

}
