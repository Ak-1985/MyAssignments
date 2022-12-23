package challenges;

public class LengthLastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		String[] arr1 = s.split(" ");
		int length1 = arr1[arr1.length-1].length();
        System.out.println("The last word is \t" + arr1[arr1.length-1] + "\t with length \t" + length1);

	}

}
