package challenges;

import java.util.Iterator;

public class MaxWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] sentences = {"alice and bob love leetcode","I think so too","continue to fight"};
         int maxlength =0;
         String maxsent ="";
         for (int i = 0; i < sentences.length; i++) {
			String[] split1 = sentences[i].split(" ");
			int length = split1.length;
			if (length > maxlength) {
				maxlength = length;
			    maxsent = sentences[i];
			}
		}
         
         System.out.println("The sentence with max words is "+ maxsent+ "and the number of words are" + maxlength );
	}

}
