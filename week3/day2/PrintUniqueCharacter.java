package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = "kiruthika devi Arumugam" ;
        
        char[] nameArray = name.toLowerCase().toCharArray();
        Set<Character> nameSet = new HashSet<Character>();
        for (int i = 0; i < nameArray.length; i++) {
        	if(nameArray[i] != ' ') {
			nameSet.add(nameArray[i]);
		}
        
	}
        System.out.println(nameSet);

}
}
