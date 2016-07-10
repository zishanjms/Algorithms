package challenge.amazon;

import java.util.Scanner;

public class NumberOfWaysToPlayGame {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		UF uf = new UF(N, input);
		
		for(int i=0; i<M; i++)
		{
			uf.union(sc.nextInt(), sc.nextInt());
		}
		
		int n = uf.numberOfGroups();
		
		long fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact *= i;
		}
		
		System.out.println( fact % 1000000007 );
	}

}

class UF
{
	private int[] id;
	private int[] sz;
	
	public UF(int N, int[] sz)
	{
		id = new int[N];
		this.sz = sz;
		
		for (int i = 0; i < id.length; i++) 
		{
			id[i] = i;
		}
	}
	
	public int root(int i)
	{
		while(i != id[i]) i = id[i];
		return i;
	}
	
	public void union(int p, int q)
	{
		p -=1;
		q -=1;
		int i = root(p);
		int j = root(q);
		if(i == j) return;
		
		if( sz[i] < sz[j] ) 
		{
			id[i] = j;
		}
		else
		{
			id[j] = i;
		}
	}
	
	public int numberOfGroups()
	{
		int counter = 0;
		for (int i = 0; i < id.length; i++) 
		{
			if(i == id[i] ) counter++;
		}
		
		return counter;
	}
	
}
