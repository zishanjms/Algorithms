package challenge.edgeverve;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1 {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		LRUCache lru = new LRUCache(N);
	
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) 
		{
			if( input.charAt(i) == '!' )
			{
				System.out.print( lru.getElementOfCache() + " " );
			}
			else
			{
				lru.put( input.charAt(i) );
			}
		}
		
		
	}

	
	
}


class LRUCache
{
	private HashMap<Character, Character> map = null;
	private Queue<Character> queue = null;
	private int maxSize;
	
	public LRUCache(int maxSize)
	{
		this.maxSize = maxSize;
		this.map = new HashMap<Character, Character>(maxSize);
		this.queue = new LinkedList<Character>();
	}
	
	public void put( Character key )
	{
		if(map.containsKey(key))
		{
			queue.remove(key);
		}
		
		while( queue.size() >= maxSize )
		{
			Character oldKey = queue.poll();	
			if( oldKey != null )
			{
				map.remove(oldKey);
			}
		}
		queue.add(key);
		map.put(key, key);
	}
	
	public Character get(Character key)
	{
		if( map.containsKey(key) )
		{
			queue.remove(key);
			queue.add(key);
			return map.get(key);
		}
		
		return null;
	}
	
	public String getElementOfCache()
	{
		StringBuilder str = new StringBuilder();
		Iterator<Character> itr = queue.iterator();
		
		while( itr.hasNext() )
		{
			str.append( itr.next() );
		}
		
		return str.toString();
	}
}