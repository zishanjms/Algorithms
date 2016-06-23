package com.zishan.StringAlgos;

public class ThreeWayRadixQuickSort
{	
	public static void main(String[] args) 
	{
		String[] strArr = {"aaag","dsfsaff","aaafad","fgrhy4","rhsdgr","dhkrhhsd","iedfher","jfhdgn","ydsdgf","nsdgvhrhrrk","fsdfhgx","dsdgskj","zzzzzzsdfafa"};

		String[] outputArr = threeWayRadixQuickSort(strArr);
		
		for (int i = 0; i < outputArr.length; i++) {
			System.out.println(outputArr[i]);
		}

	}

	public static String[] threeWayRadixQuickSort(String[] strArr)
	{
		sort(strArr, 0, strArr.length-1, 0);
		return strArr;
	}
	
	private static void sort(String[] strArr, int low, int high, int d)
	{
		if(high<=low) return;
		int li = low; int gr = high;
		int pivot = charAt(strArr[li], d);
		int i=li+1;
		while(i<=gr)
		{
			int t = charAt(strArr[i], d);
			if(t<pivot) exch(strArr, li++, i++);
			else if(t>pivot) exch(strArr, i, gr--);
			else i++;
		}
		
		sort(strArr, low, li-1, d);
		if(pivot>=0) sort(strArr, li, gr, d+1);
		sort(strArr, gr+1, high, d);
	}
	
	private static int charAt(String str, int d)
	{
		if(d<str.length()) return str.charAt(d);
		return -1;
	}
	
	private static void exch(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
