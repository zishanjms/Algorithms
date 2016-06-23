package dynamicProgramming.allSubSets;

import java.util.ArrayList;

public class GenerateAllSubsets {

	public static void main(String[] args) {
		
		int n=4;
		ArrayList<Integer> set = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			set.add(i);
		}
		
		ArrayList<ArrayList<Integer>> allSubSets = getSubsets(set, 0);
		
		for(ArrayList<Integer> sets : allSubSets)
		{
			System.out.println(sets.toString());
		}
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
	
}
