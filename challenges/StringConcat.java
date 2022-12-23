package challenges;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1 = {"ab","c"};
		String[] word2 = {"a","cb"};
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < word1.length; i++) {
			sb.append(word1[i]);
		}
		for (int i = 0; i < word2.length; i++) {
			sb1.append(word2[i]);
		}
		if (sb.toString().equalsIgnoreCase(sb1.toString())) {
			System.out.println("The two strings are same ");
		} else {
			System.out.println("The two strings are different");
		}
		

	}

}
