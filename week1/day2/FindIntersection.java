package week1.day2;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		Arrays.sort(arr1);//{2,3,4,6,7,11}
		int[] arr2 = {1,2,8,4,9,7};
		Arrays.sort(arr2);//{1,2,4,7,8,9}
		//int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) {
					//count++;
					System.out.println(arr1[i]);
					//int[] arr3 = new int[count];
					//arr3[i]= arr1[i];
					//System.out.println(arr3);
					
				}
				
			}
			
			
		} 

	}

}
