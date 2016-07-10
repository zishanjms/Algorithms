package challenge.thoughtworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayList<Integer> set = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
        	arr[i] = sc.nextInt();
        	set.add(arr[i]);
        }
        
        int[][] mat = new int[100][100];
        
        for( int i=0; i<N; i++){
        	for(int j=0; j<N; j++){
        		mat[arr[i]][arr[j]] = findGCD(arr[i], arr[j]);
        	}
        }
        
        int counter = 0;
        ArrayList<ArrayList<Integer>> allSubSets = getSubsets(set, 0);
		
		for(ArrayList<Integer> sets : allSubSets)
		{
			if(isSetContainsAllConsecutiveValuesAndGCDof1(sets, mat)){
				counter++;
			}
		}
		System.out.println(counter+1);
    }
    
    public static boolean isSetContainsAllConsecutiveValuesAndGCDof1(ArrayList<Integer> set, int[][] mat){
    	boolean result = true;
    	for(int i=0; i<set.size()-1; i++){
    		if(set.get(i) > set.get(i+1));
    		 result = false;
    	}
    	
    	if(result == true){
    		for(int i=0; i<set.size()-1; i++){
    			for(int j=i; j<set.size(); j++){
    				if(mat[set.get(i)][set.get(j)] != 1){
    					result = false;
    					break;
    				}
    			}
    		}
    	}
    	
    	return result;
    }
    
    
    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index)
	{
		ArrayList<ArrayList<Integer>> allSubsets;
		
		if(set.size()==index)
		{
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}
		else
		{
			allSubsets = getSubsets(set, index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> sets : allSubsets)
			{
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(sets);
				newSubset.add(item);
				moreSubSets.add(newSubset);
			}
			allSubsets.addAll(moreSubSets);
		}
		return allSubsets;
	}
    
    public static int findGCD(int m, int n)
	{
		int remainder=0;
		while(n!=0)
		{
			remainder = m%n;
			m  = n;
			n = remainder;
			
		}
		
		return m;
	}
}
