package com.java.collections.treeset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		/*Set set = new TreeSet();
		
		set.add("2");
		set.add(3);
		set.add(1);
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Map<Integer, String=""> map = new HashMap<Integer, String="">();
		*/
		before();
	}

	public static void before()
	{
		TreeSet set = new TreeSet();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("one");
			
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}
