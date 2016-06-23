package impetusMachineProblem;

public class MachineOutputProblem {

	public static void main(String[] args) {

		String input = "1,5,9,2,3,5,6";
		
		String result = outputSequence(input);
		
		System.out.println("Output Seqence "+result);
	}

	public static String outputSequence(String input)
	{
		String[] items = input.split(",");
		
		int [] inputArray = new int[items.length];
		
		for (int i = 0; i < items.length; i++) {
		    try {
		    	inputArray[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {};
		}
		
		
		for (int i = 0; i < inputArray.length-1; i++) {
			
			for (int j = 0; j < inputArray.length-i-1; j++) {
				
			inputArray[j] =	inputArray[j+1] - inputArray[j];
			}
			
		}
		
		
		return inputArray[0]+"";
	}
	
}
