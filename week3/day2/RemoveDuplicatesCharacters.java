package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert the input string to array
         String input = "PayPal";
         char[] inputArray = input.toLowerCase().toCharArray();
         
         //Create two empty sets
         Set<Character> charSet = new HashSet<Character>();
         Set<Character> dupcharSet = new HashSet<Character>();
         
         //Iterate over the array and add add duplicate characters to another set
         for (int i = 0; i < inputArray.length; i++) {
			if(charSet.contains(inputArray[i])) {
				dupcharSet.add(inputArray[i]);
			} else {
				charSet.add(inputArray[i]);
			}
		}
         System.out.println(charSet);
         System.out.println(dupcharSet);
         
         for (Character letter : charSet) {
			if (letter != ' ') {
				System.out.println(letter);
			}
		}
	}

}
