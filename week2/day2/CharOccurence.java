package week2.day2;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing the string 
		String str = "welcome to chennai";
		
		//Initializing count
		int count = 0;
		char occur = 'e';
		
		//Converting string to character array
		char[] charArr = str.toCharArray();
		
		//Iterating over the character array
		for (int i =0; i<= charArr.length-1;i++) {
			if (charArr[i] == occur) {
				//Counting the number of occurences
				count++;
			}
		}
		System.out.println("The number of occurences of " + occur + "\t in \t" + str + "\t is " + count);
		

	}

}
