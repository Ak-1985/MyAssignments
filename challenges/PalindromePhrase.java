
package challenges;

public class PalindromePhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String	s = "A man, a plan, a canal: Panama";
	     String replacedText = s.toLowerCase().replaceAll("[^a-zA-Z]+","");
	     System.out.println(replacedText);
	 	 char[] textArray = replacedText.toCharArray();
	     String rev = "" ;
	     for (int i = textArray.length-1; i >= 0; i--) {
			rev += textArray[i];
		}
	     System.out.println(rev);
	     if(rev.equals(replacedText)) {
	    	 System.out.println("The string \t" + s  + "\t is palindrome");
	     } else {
	    	 System.out.println("The string \t" + s  + "\t is not palindrome");
	}

}
}
