package evenNumberProblem;

public class EvenNumberCalculationProblem {

	public static void main(String[] args) {
		
		
		String inputString = "574674546476";
		
		String [] items = inputString.split("");
		
		if(items.length>10000 || items.length<=0)
		{
			return;
		}
		
		int[] inputArray = new int[items.length+1];
		
		for (int i = 1; i < items.length; i++) {
			
			try {
				inputArray[i] = Integer.parseInt(items[i-1]);
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}	
		}
		
		int [] resultArray = new int[inputArray.length]; 
		
		for (int i = 1; i < inputArray.length; i++) {
			
			for (int j = i; j < inputArray.length; j++) {
				
				if((inputArray[j]%2)==0)
				{
					resultArray[i]++;
				}
				
			}
		}
		
		System.out.println("Final Array Output :: ");
		
		for (int i = 1; i < resultArray.length; i++) {
		System.out.print("\t "+resultArray[i]);	
		}
	}

}
