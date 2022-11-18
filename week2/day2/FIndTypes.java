package week2.day2;

public class FIndTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Initializing count
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				
				//Converting the string to array
				char[] testArray = test.toCharArray();
				
				//iterating over array
				for (int i=0;i <= testArray.length-1;i++) {
					if (Character.isLetter(testArray[i])) {
						letter++;
					} else if (Character.isDigit(testArray[i])) {
						num++;
					} else if (Character.isSpaceChar(testArray[i])) {
						space++;
					} else {
						
					   specialChar++;
					  
					}
				}
				
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

	}

}
