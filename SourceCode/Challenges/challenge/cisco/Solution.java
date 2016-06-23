package challenge.cisco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] inputs = new String[t];
		for(int i=0; i<t; i++){
			inputs[i] = scanner.next();
		}

		System.out.println(maxMediators(inputs, t));*/
		
		boolean var1 = true;
		boolean var2 = false;
		System.out.println(var1 & var2);
		
		String obj = "I LIKE coding";
        System.out.println(obj.charAt(12));
        
        int a=20, b=12;
        if((a < b) && (b++ < 25)){
            System.out.println("Hi");
        }
        System.out.println(b);
        
        int x, y;
        x = 5 >> 2;
        y = x >>> 2;
        System.out.println(y);
	}

	public static int maxMediators(String[] inputs, int length){
		
		ArrayList<Integer> teams = new ArrayList<>();
		
		for (int i = 0; i < inputs.length; i++) {
			if(inputs[i].startsWith("C")){
				teams.add(i);
			}
		}
		
		int max=0;
		
		for (int i = 0; i < teams.size(); i++) {
			for (int j = i; j < teams.size(); j++) {
				int path = findPath(inputs,teams.get(i), teams.get(j));
				if(path>max){
					max = path;
				}
			}
		}
		return max;
	}
	
	public static int findPath(String[] inputs, int c1 , int c2){
		int d1 = -1, d2 = -1, dist = -1;
		
		d1 = getHeight(c1);
		d2 = getHeight(c2);
		// find Index of Lowest Common Ancestor
		int lca = findLowestCommonAncestor(inputs, c1, c2);
		
		dist = getHeight(lca);
		
		return d1 + d2 - ((2*dist)+1);
		
	}
	
	public static int getHeight(int node){
		int height = 0;
		while(node!=0){
			height++;
			node = node/2;
		}
		return height;
	}
	
	public static int findLowestCommonAncestor(String[] inputs, int c1, int c2){
		
		Set<String> set = new HashSet<>();
		String root = inputs[1];
		String parentOfC1 = "";
		while(!root.equals(parentOfC1)){
			int parent = findParentNodeIndex(c1);
			parentOfC1 = inputs[parent];
			set.add(parentOfC1);
			c1 = parent;
		}
		String parentOfC2 = "";
		int parentOfC2Index = 0;
		while(!root.equals(parentOfC2)){
			parentOfC2Index = findParentNodeIndex(c2);
			parentOfC2 = inputs[parentOfC2Index];
			if(set.contains(parentOfC2)){
				break;
			}
			c2 = parentOfC2Index;
		}
		
		return parentOfC2Index; 
	}
	
	public static int findParentNodeIndex(int child){
		return child/2;
		
	}
}
