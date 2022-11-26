package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input data
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//Declaring a treeSet for ascending order or we can use Collections.sort(list) after converting set to list
		Set<Integer> numSet = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			numSet.add(data[i]);
		}
		
		//Converting list to set by passing set as an argument
        List<Integer> numList = new ArrayList<Integer>(numSet);
        
        //Obtaining the index of second largest number
        int secondLargestIndex = numList.size()-2;
        System.out.println(numList.get(secondLargestIndex));
	}

}
