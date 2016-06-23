package com.zishan.dp;

public class IntegerBreak
{
	 
    public int integerBreak(int n) 
    {
        int[] mem = new int[n+1];
        mem[0] = 1;
        mem[1] = 1;
        mem[2] = 1;
        for(int i=3 ; i<=n; i++)
        {
            mem[i] = mem[i-3] * 3;
        }
        
        return mem[n];
    }

	public static void main(String[] args) {
		System.out.println(new IntegerBreak().integerBreak(10));

	}

}
