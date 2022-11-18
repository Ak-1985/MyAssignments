package week2.day2;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing two strings
        String text1 ="stops";
        String text2 ="potss";
        
        //ONly when 2 string length are equal
        if (text1.length()==text2.length()) {
        	
        	//Converting strings to character arrays
        	char[] charArray1 = text1.toCharArray();
        	char[] charArray2 = text2.toCharArray();
        	
        	//Sort the arrays
        	Arrays.sort(charArray1);
        	Arrays.sort(charArray2);
        	
        	//Comparing both the arrays
        	boolean result = Arrays.equals(charArray1, charArray2);
        	
        //printing the output	
        if (result) {
        	System.out.println("The word \t"+ text2 + "is anagaram of \t" + text1);
        }else {
        	System.out.println("The word \t"+ text2 + "is not anagaram of \t" + text1);
        }
        } else {
        	System.out.println("The word \t"+ text2 + "is not anagaram of \t" + text1);
        }
        
	} 

}
