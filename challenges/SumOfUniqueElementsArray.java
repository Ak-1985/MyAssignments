package challenges;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SumOfUniqueElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		List<Integer> uniqueElements = new ArrayList <Integer>();
		Map<Integer,Integer> numberTable = new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(numberTable.containsKey(arr[i]))	{
				int value = numberTable.get(arr[i]);
				numberTable.put(arr[i], value+1);
			} else {
				numberTable.put(arr[i],1);
			}
		} 
		for(Entry<Integer,Integer> entry:numberTable.entrySet()) {
			if (entry.getValue() == 1) {
				sum = sum + entry.getKey();
				uniqueElements.add(entry.getKey());
				
		} 

	}
		
	if(sum > 0)	{	
     System.out.println("The sum of unique elements "+uniqueElements+" is " + sum);
	} else {
		 System.out.println("There are no unique elements and the sum is" + sum);
	}
}

	}


