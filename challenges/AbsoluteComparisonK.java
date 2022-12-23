package challenges;

public class AbsoluteComparisonK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] nums = {1,2,3,1};
		int k = 3;
		int maxcount = 0;
		int index =0;
		int index2 =0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i+1; j < nums.length; j++) {
				if( (nums[i]==nums[j]) && (Math.abs(i-j)<= k)) {
					count++;
				}
				if (count > 0) {
					index2=j;
				}
				
			}
			if (count > maxcount) {
				maxcount = count;
				index=i;
			}
		}
		if (maxcount > 0)
		       System.out.println("Pass");
		       System.out.println("The indices are "+index+" and " +index2);
	}

}
