package challenges;



public class DistinctiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
					
				} 
			}
		}
		
		if (count == 0) {
			System.out.println("false");
		} else {
		   System.out.println("true");
		
		}

	}
}

