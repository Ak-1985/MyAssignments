package challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean repeatedOccur = distinctInteger(nums);
		System.out.println("The repeated occurence is "+ repeatedOccur);
	}

	
	public static boolean distinctInteger(int[] nums) {
		
		Map<Integer,Integer> hashIntegerTable = new LinkedHashMap<Integer,Integer>();
	    for (int i = 0; i < nums.length; i++) {
	    	if(hashIntegerTable.containsKey(nums[i])) {
	    		int value = hashIntegerTable.get(nums[i]);
	    		hashIntegerTable.put(nums[i], value + 1);
	    	} else {
	    		hashIntegerTable.put(nums[i],1);
	    	}
			
						
			}
	    
	    for(Entry<Integer, Integer> entry:hashIntegerTable.entrySet()) {
	    	if (entry.getValue()>1) {
	    		return true;
	    	} 
	    }
		return false;
	}
	}	
	

