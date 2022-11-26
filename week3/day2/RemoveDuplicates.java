package week3.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input string
		String text = "We learn java basics as part of java sessions in java week1";
				
		//Split the string and store it in a array
		String[] textArray = text.split(" ");
		
		//INtializing count variable
		 int count = 0;
		 
		 //iterating over array
		 for (int i = 0; i < textArray.length; i++) {
			 for (int j = i+1; j < textArray.length; j++) {
				 if(textArray[i].equalsIgnoreCase(textArray[j])) {
					 count ++;
					 //if we detect duplicate word, replace it with empty string
					 if (count > 0) {
						 textArray[j] = "";
					 }
					 
				 } 
				 
			}
			 
		}
		 
		 for (String stringObtained : textArray) {
			System.out.print(stringObtained + " ");
		}

	}

}
