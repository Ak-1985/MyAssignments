package challenges;

public class JewelsStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String jewels = "z";
        String stones ="ZZ";
        int count =0;
        char[] charArray = jewels.toCharArray();
        char[] charArray2 = stones.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray2.length; j++) {
				if(charArray[i]==charArray2[j]) {
					count = count +1;
					//System.out.println();
				}
			}
			
			
		}
        
        System.out.println("The number of jewels in stones are " + count);
	}

}
