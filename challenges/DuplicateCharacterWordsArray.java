package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateCharacterWordsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	        String[] A = {"bella" , "label" , "roller"};
	        List <String> result = commonChars(A);
	        if(result.size() == 0)
	            System.out.println("No common characters");
	        else
	        {
	            for(String s : result)
	                System.out.print(s + " ");
	        }
	    }
	   public static List <String> commonChars(String[] A) {
	        HashMap <Character , Integer> finalCount = new HashMap <Character,Integer>();
	        for(char c = 'a' ; c <= 'z' ; ++c)
	            finalCount.put(c , 100);//Assigning the frequency as 100
	        HashMap <Character , Integer> count = new HashMap<Character,Integer>();
	        for(String word : A)
	        {
	            count.clear();
	            for(char c : word.toCharArray()) 
	        	    count.put(c , count.getOrDefault(c , 0) + 1);
	           
	            for(char c = 'a' ; c <= 'z' ; ++c)
	                finalCount.put(c , Math.min(finalCount.get(c) , count.getOrDefault(c , 0)));//taking the minimum of the values at every cycle of loop
	                 //System.out.println(finalCount);
	        }
	        
	        List <String> result = new ArrayList<String>();
	        int times;
	        for(char c = 'a' ; c <= 'z' ; ++c)
	        {
	            times = finalCount.get(c);
	            while(times > 0)
	            {
	                result.add(Character.toString(c));
	                --times;
	            }
	        }
	        return result;
	    }
		
	}


