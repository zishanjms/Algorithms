package challenge.huawei.level1;

import java.util.ArrayList;

public class CandidateCode {

	public static void main(String[] args) {
		
		String input1 = "5#9#6#4#6#8#0#7#1#5";
		
		String output = validtrianglesum1(input1);

		System.out.println("Final Result is: "+output);
	}
	
	 public static String validtrianglesum(String input1)
	    {
	        String[] strArr = input1.split("#");
	        
	        int noOfRows=0;
	        int totalValue = strArr.length; 
	        
	        int decIndex = 1;
	        
	        while(totalValue>0) // this logic is to get nbrOf Rows in Triangle { [n*(n+1)]/2 = strArr.length }
	        {
	        	totalValue = totalValue - decIndex;
	        	decIndex++;
	        	noOfRows++;
	        }

	        if(totalValue<0)
	        {
	        	return "Invalid";
	        }
	        	
	        
	        int inputIdx = 0;
	        ArrayList<CustomRow> arrayList = new ArrayList<>();
	        
	        for (int i = 1; i <= noOfRows; i++) {
				
	        	CustomRow custRow = new CustomRow(i);
	        	
	        	for (int j = 1; j <= i; j++, inputIdx++) {
					
	        		custRow.setElementAtIndex(Integer.parseInt(strArr[inputIdx]), j-1);
				}
	        	
	        	arrayList.add(custRow);
			}
	        
	        System.out.println("till before sum");
	        
	        int sum=0;
	        for (CustomRow  custRow : arrayList) {
				sum += custRow.getMax();
			}
	        
	        return String.valueOf(sum);
	    }
	 
	 public static String validtrianglesum1(String input1)
	    {
	        String[] strArr = input1.split("#");
	        
	        int noOfRows=0;
	        int totalValue = strArr.length; 
	        
	        int decIndex = 1;
	        
	        while(totalValue>0) // this logic is to get nbrOf Rows in Triangle { [n*(n+1)]/2 = strArr.length }
	        {
	        	totalValue = totalValue - decIndex;
	        	decIndex++;
	        	noOfRows++;
	        }

	        if(totalValue<0)
	        {
	        	return "Invalid";
	        }
	        	
	        
	        int inputIdx = 0;
	        int[] maxArray = new int[noOfRows];
 	        
	        for (int i = 0; i < noOfRows; i++) {
				
	        	maxArray[i] = -1;
	        	
	        	for (int j = 0; j <= i; j++, inputIdx++) {
					
	        		try {
						
					
	        		
	        		int element = Integer.parseInt(strArr[inputIdx]);
	        		if(element>maxArray[i])
	        			maxArray[i] = element;
	        		} catch (Exception e) {
						return "Invalid";
					}
	        		
	        	}
	        	
			}
	        
	        
	        int sum=0;
	        for (int maxOfRow : maxArray) {
				sum += maxOfRow;
			}
	        
	        return String.valueOf(sum);
	    }
}

class CustomRow{
	 
	 private int[] arr;
	 private int max;
	 
	 
	 public CustomRow(int arrSize)
	 {
		 arr = new int[arrSize];
		 max = -1;
	 }
	 
	 public void setElementAtIndex(int element, int index)
	 {
		 if(element>max)
		 {
			 max = element;
		 }
		 arr[index] = element;
	 }
	 
	 public int getMax()
	 {
		 return this.max;
	 }
}