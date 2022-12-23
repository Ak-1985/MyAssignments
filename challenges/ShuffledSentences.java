package challenges;

public class ShuffledSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s = "is2 sentence4 This1 a3";
		
		
		String[] words = s.split(" ");
        String[] senArr = new String[words.length];
        StringBuilder sb = new StringBuilder();
        
        // reorder all the words and remove the number of each word
        for (int i = 0; i < words.length; i++) {
        	//System.out.println((words[i].charAt(words[i].length()-1)));
            senArr[Character.getNumericValue(words[i].charAt(words[i].length() - 1)) - 1] 
                = words[i].substring(0, words[i].length() - 1);
        }
        
        // put all the words together
        for (int i = 0; i < senArr.length; i++) {
            sb.append(senArr[i]);
            sb.append(' ');
        }
        
        System.out.println(sb.toString());
			}
		
	}


