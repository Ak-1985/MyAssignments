package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text = "abbaba";
       char[] charArray = text.toCharArray();
       Map<Character,Integer> charMap = new HashMap<Character,Integer>();
       for (int i = 0; i < charArray.length; i++) {
		if (charMap.containsKey(charArray[i])) {
			//System.out.println(charArray[i]);
			int value = charMap.get(charArray[i]);
			charMap.put(charArray[i], value + 1);
					
		} else {
			charMap.put(charArray[i], 1);
		}
	}
       /*int maxOccurence =0;
       Set<Entry<Character,Integer>> charEntrySet = charMap.entrySet();
       for (Entry<Character, Integer> charEntry : charEntrySet) {
			if (charEntry.getValue()> maxOccurence) {
				System.out.println(charEntry.getValue());*/
       
       
				 
	
			}
		} 
       
	

	
	
