package com.zishan.StringAlgos;

public class LSDRadixStringSort {

	public static void main(String[] args) {
		String[] strArr = {"aaa","dsf","asd","fgr","rhs","ksd","ier","jgn","ydf","nvk","fgx","dkj"};
		int W = 3;

		String[] outputArr = lsdRadixSort(strArr,W);
		
		for (int i = 0; i < outputArr.length; i++) {
			System.out.println(outputArr[i]);
		}
	}

	public static String[] lsdRadixSort(String[] words, int W)
	{
		int N = words.length;
		String[] aux = new String[N];
		int R = 256;
		
		for(int d= W-1; d>=0; d--)
		{
			int[] count = new int[R+1];
			
			//Count frequency
			for (int i = 0; i < N; i++)
			{
				count[words[i].charAt(d)+1] += 1; 
			}
			
			//Count Cumulates
			for (int i = 0; i < R; i++) 
			{
				count[i+1] += count[i];
			}
			
			//sort array
			for (int i = 0; i < N; i++)
			{
				aux[count[words[i].charAt(d)]++] = words[i]; 
			}
			
			for (int i = 0; i < N; i++)
			{
				words[i] = aux[i];
			}
		}
		
		return words;
	}
}
