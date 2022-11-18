package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing string
		String text1 ="madam";
		
		//Initializing empty string
		String rev = "";
		
		//Converting string to array of characters using method
		char[] charArray = text1.toCharArray();
		
		//iterating over the character array in reverse way 
		for (int i = charArray.length-1; i >=0 ;i--) {
			
		//Assigning the reversed character to string variable and concatenating it	
			 rev += charArray[i];
			
		}
		//System.out.println(rev);
		//Comparing both the strings
		if (text1.equalsIgnoreCase(rev)) {
			System.out.println("The string \t"+ text1 + "\t is palindrome");
		} else {
			System.out.println("The string \t"+ text1 + "\t is not palindrome");
		}
		

	}

}
