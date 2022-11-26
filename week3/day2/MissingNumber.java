package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input of numbers from 1 and 10 and there are numbers missing
        int[] num = {2,3,5,7,7,8,4,5,6,7,8,9};
        
        Set<Integer> newNum = new TreeSet<Integer>();
        for (int i = 0; i < num.length; i++) {
			newNum.add(num[i]);
		}
        
        for (int i=1;i<=10;i++) {
        	if(!newNum.contains(i)) {
        		System.out.println("The missing number is " + i);
        	}
        }
        
	}

}
