package challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LuckyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,2,2,3,3};
		int maxnum = 0;
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
			if (entry.getValue() == entry.getKey()) {
				if(entry.getValue()> maxnum) {
				maxnum = entry.getKey();
			}
		} 

	}
		if (maxnum > 0) {
		System.out.println("The number that is lucky number is " + maxnum);
		} else {
			System.out.println("No lucky number");
		}

}
}