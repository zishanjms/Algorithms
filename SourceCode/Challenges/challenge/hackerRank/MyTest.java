package challenge.hackerRank;

import java.util.ArrayList;

public class MyTest {

	public static void main(String[] args) {
		//ArrayList<Double> notificationList = new ArrayList<Double>();
		//ArrayList<ArrayList<Double>> finalList = new ArrayList<ArrayList<Double>>(); 
		 
		//suppose notificationList is returing this value = [3.75, 4.75, 5, 6, 7, 8, 9, 10]
		//now I am adding this list into finalList.
		//finalList : [[3.75, 4.75, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0], [3.75, 4.75, 5.0, 6, 7, 8, 9, 10]]  
		//but the result , what I want is 
		//finalList : [[3.75, 4.75, 5, 6, 7, 8, 9, 10]|[3.75, 4.75, 5, 6, 7, 8, 9, 10]]
		
		
		//lets suppose we have an arrayList of double 
		ArrayList<Double> inputList = new ArrayList<>();
		inputList.add(3.75);
		inputList.add(4.75);
		inputList.add(5.00);
		inputList.add(6.00);
		inputList.add(7.0);
		inputList.add(8.0);
		inputList.add(9.0);
		inputList.add(10.0);
		
		ArrayList<String> notificationList =  new ArrayList<>();
		// Add double value to String notificationList which contains double value and int value
		for(Double doubleValue : inputList){
			if((doubleValue%1)==0){
				int intValue = doubleValue.intValue();
				notificationList.add(intValue+"");
			}
			else
			{
				notificationList.add(doubleValue+"");
			}
		}
		// Create one more notification List 
		ArrayList<String> notificationList1 = new ArrayList<>(notificationList);
		
		String result = "[";
		// loop through for every arrayList, append it to String and add "|" at end except the last for last arraylist
		result = result + notificationList.toString();
		result = result + "|";
		result = result + notificationList1.toString();
		result = result + "]";
		
		System.out.println(result);
	}

}
