package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//input string
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Split the string and store it in a array
        String[] textArray = text.split(" ");
        
        //Using linked hashset for order of insertion instead of regular hashset which is faster
        Set<String> textObtained = new LinkedHashSet<String>();
        
        //Iterating over array and adding the items to linkedhashset
        for(int i =0; i < textArray.length ; i++) {
        	textObtained.add(textArray[i]);
        }
        
        //Printing the output together in a single line
        for (String textAltered : textObtained) {
			System.out.print(textAltered + " ");
		}
	}

}
