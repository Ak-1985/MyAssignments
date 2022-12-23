package challenges;

import java.util.Iterator;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,3};
		
		int maxcount = 0;
		int index = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int count =0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					count++;
				}
					
							
			
			}
			
			if (count > maxcount) {
				maxcount = count;
				index= i;
			} 
			
		}
		
		if (maxcount > (nums.length/2)) {
			System.out.println("The majority element is " + nums[index]);
		} else {
			System.out.println("No majority element");
		}
		

}
}
