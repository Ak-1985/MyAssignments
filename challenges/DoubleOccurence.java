package challenges;

              

public class DoubleOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccbffcz";
		int index =-1;
		for (int i = 1; i < s.length(); i++) {
			//System.out.println(s.charAt(i-1));
			if(s.charAt(i)==s.charAt(i-1)) {
				
				index=i;
				break;
			}
		}
       System.out.println("the first character to occur double is " + s.charAt(index));
	}
}


