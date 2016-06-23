package challenge.ebay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class TreeProblem {

	public static void main(String[] args) throws FileNotFoundException {
		 Scanner sc = new Scanner(new FileInputStream(new File("C://Users//zsaiyed//Desktop//ChallengeInput1.txt")));
	        int N = sc.nextInt();
	        long K = sc.nextLong();
	        
	        int[] arr = new int[N+1];
	        for(int i=0; i<=N; i++)
	        {
	        	arr[i] = i;
	        }
	        while(sc.hasNextInt()){
	        	int parent  = sc.nextInt();
	        	int child = sc.nextInt();
	        	arr[child] = parent;
	        }
	        int counter = 0;
	        for(int i=N; i>0; i--)
	        {
	        	counter += printPair(arr, i, K);
	        }
	        
	        System.out.println(counter);
	    }
	    
	public static int printPair(int[] arr, int i, long k){
		int child = i;
		int counter = 0;
		while(arr[i] != i)
		{
			int parent = arr[i];
			long mut = (long)parent *child;
			if(mut <= k)
			{
				counter++;
			}
			i = arr[i];
		}
		
		return counter;
	}
	
}

class Tree{
	private int V;
	private ArrayList<Integer> [] adj;
	private int K;
	public int mutCounter = 0;
	
	public Tree(int N, int K){
		this.V = N;
		this.K = K;
		adj = (ArrayList<Integer>[]) new ArrayList[V+1];
		for(int v=0; v<adj.length; v++ ){
			adj[v] = new ArrayList<Integer>();
		}
	}
	
 	public void addNode(int parent, int child){
		adj[parent].add(child);
	}
	
	public Iterable<Integer> adj(int i){
		return adj[i];
	}
	
	public void dfs(int v, int ancestor){
		for(int w: adj(v)){
			if(ancestor*w <= K){
				mutCounter++;
			}
			dfs(w, ancestor);
		}
	}
}
