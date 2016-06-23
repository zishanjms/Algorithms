package com.zishan.StringAlgos;

public class KeyIndexedCounting {

	public static void main(String[] args) {
		char[] charArr = {'d','a','c', 'f','f','b','d','b','f','b','e','a'};
	
		char[] sortedArray = keyIndexedCount(charArr,6);
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print("\t" + sortedArray[i]);
		}
 	}

	public static char[] keyIndexedCount(char[] charArr, int R)
	{
		int N = charArr.length;
		char[] aux = new char[N];
		char[] count = new char[R+1];
		
		for(int i=0; i<N; i++) // Count frequencies of Characters
		{
			int index = charArr[i] -'a';
			count[index+1] += 1;
		}
		
		for(int i=0; i<R; i++) // Count Cumulates
		{
			count[i+1] +=count[i];
		}
		
		for (int i = 0; i < N; i++) 
		{
			int index = charArr[i] - 'a';
			aux[count[index]++] = charArr[i];
		}
		
		for (int i = 0; i < N; i++) 
		{
			charArr[i] = aux[i];
		}
		
		return charArr;
	}
}
