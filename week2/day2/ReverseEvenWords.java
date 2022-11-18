package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize string 
		String test = "I am a software tester"; 
		
		//Split the string to array
		String[] wordArray = test.split(" ");
		
		//iterate
		for (int i=0;i<=wordArray.length-1;i++) {
			//Taking odd index using mod operator
			if (i % 2 ==1) {
				
				//Reversing the string same as palindrome program
				String rev ="";
				char[] charArray = wordArray[i].toCharArray();
				for (int j=charArray.length-1;j>=0;j--) {
					rev += charArray[j];
				}
				
				
				//Output
				System.out.print(rev +" ");
							
			//Output
		} else {
			System.out.print(wordArray[i]+" ");
		}
		
		 
		

	}
	}
}
