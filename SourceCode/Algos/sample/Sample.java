package sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		Set<Long> itemIdSet = new HashSet<Long>();
        Set<String> batchNbrSet = new HashSet<String>();
        Set<Double> stdPackQtySet = new HashSet<Double>();
        stdPackQtySet.add(1.44);
        Map returnValueMap = new HashMap();
        returnValueMap.put("ItemIds", itemIdSet);
        returnValueMap.put("BatchNbrs", batchNbrSet);
        returnValueMap.put("StdPackQty", stdPackQtySet);
        Set StdQtySet = (Set)returnValueMap.get("StdPackQty");
        System.out.println("Size of Set : "+ StdQtySet.size());
        
        Iterator iterator = StdQtySet.iterator();
        
        while(iterator.hasNext())
        {
        	System.out.println("Non Empty Set Values: "+iterator.next());
        }
        
       //System.out.println("Empty set" + new BigDecimal((Double)StdQtySet.iterator()));


	}

}
