package challenges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class NonRepeatingCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabb";
		Character ch = distinctCharacter(s);
		System.out.println("The non repeating character is " +  ch );
			
		
	}




public static Character distinctCharacter(String str) {
	char[] charArray1 = str.toCharArray();
	Map<Character,Integer> hashCharactertable = new LinkedHashMap<Character,Integer>();
    for (int i = 0; i < charArray1.length; i++) {
    	if(hashCharactertable.containsKey(charArray1[i])) {
    		int value = hashCharactertable.get(charArray1[i]);
    		hashCharactertable.put(charArray1[i], value + 1);
    	} else {
    		hashCharactertable.put(charArray1[i],1);
    	}
		
					
		}
    
    for(Entry<Character, Integer> entry:hashCharactertable.entrySet()) {
    	if (entry.getValue()==1) {
    		return entry.getKey();
    	} 
    }
	return null;
}
}