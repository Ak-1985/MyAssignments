package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};
        Map<Integer, Integer> numOccur = new TreeMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
			if(numOccur.containsKey(nums[i])) {
				int value = numOccur.get(nums[i]);
				numOccur.put(nums[i], value + 1);
			} else {
				numOccur.put(nums[i], 1);
			}
		}
        Set<Entry<Integer,Integer>> numEntrySet =numOccur.entrySet();
        for (Entry<Integer, Integer> numEntry : numEntrySet) {
			System.out.println(numEntry.getKey() + "->" + numEntry.getValue());
		}
	}

}
