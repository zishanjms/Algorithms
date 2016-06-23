package englishAlphabets;


public class EnglishAlphaBelts {

	public static void main(String[] args) {
		
		int n = 5; // size of Matrix
		String [] inputArray = {"EDEEE","DISKE","ESEEE","ECEEE","EEEEE"};
		String toBeSearch = "DISK";
		
	int finalResult = 	word_count(n, inputArray, toBeSearch);
	
	System.out.println("No. of times word found :: "+finalResult);
	}

	public static int word_count(int input1,String[] input2,String input3)
    {
        int result=0;
        char [] inputArray = input3.toCharArray();
        if(input1>50)
         return 0;
        
        char [][] matrix = new char[input1][input1];
        
        for (int i = 0; i < input2.length; i++) {
		
        	char [] charArray = input2[i].toCharArray();
        	
        	int k=0;
        	for (int j = 0; j < charArray.length; j++) {
        		
        		if(charArray[j]!='#')
        		{
        			matrix[i][k]=charArray[j];
        			k++;
        		}	
			}
		}
		
        for (int i = 0; i < matrix.length; i++) {
			
        	for (int j = 0; j < matrix.length; j++) {
				
        		
        		
        		
        		// FOr horizontally Left To Right Comparison
        		int m =0; 
        		while(m<inputArray.length && (j+m)<input1 && matrix[i][j+m]==inputArray[m])
        		{
        				m++;
        		}
        		if(m==inputArray.length)
        		{
        			result++;
        		}
        		
        		// for vertically downward comparison
        		m =0; 
        		while(m<inputArray.length && (i+m)<input1 && matrix[i+m][j]==inputArray[m])
        		{
        				m++;
        		}
        		if(m==inputArray.length)
        		{
        			result++;
        		}
        		
        		
        		// for diagonally towards left downward comparison
        		m =0; 
        		while(m<inputArray.length && (i+m)<input1 && (j+m)<input1 && matrix[i+m][j+m]==inputArray[m])
        		{
        				m++;
        		}
        		if(m==inputArray.length)
        		{
        			result++;
        		}
        		
        		// for diagonally towards left upward comparison
        		m =0; 
        		while(m<inputArray.length && (i-m)>=0 && (j+m)<input1 && matrix[i-m][j+m]==inputArray[m])
        		{
        				m++;
        		}
        		if(m==inputArray.length)
        		{
        			result++;
        		}
			}
		}
        
        
        
        return result;
    }
}
