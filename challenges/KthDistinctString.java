package challenges;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KthDistinctString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"a","b","a"};
		int k =3;
		int count =0;
		String ele = "";
		
		Map<String,Integer> stringTable = new LinkedHashMap<String,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(stringTable.containsKey(arr[i]))	{
				int value = stringTable.get(arr[i]);
				stringTable.put(arr[i], value+1);
			} else {
				stringTable.put(arr[i],1);
			}
		} 
		for(Entry<String,Integer> entry:stringTable.entrySet()) {
			if (entry.getValue() == 1) {
				count++;
				//System.out.println(count);
				if (count == k) {
					ele = entry.getKey();
					break;
				}
				
		} 
			

	}
		if (count == k) {
      System.out.println("The distinct element that appears at kth value is  " + ele);
	} else {
		System.out.println("There are fewer than "+k+" distinct elements");
	}

}
}
