package challenges;


import java.util.Arrays;


public class DistanceBetweenCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaab";
		char ch = 'b';
		int n = s.length();
        int[] res = new int[n];
        int pos = -n;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == ch) pos = i;
            //System.out.println(pos);
            //System.out.println(i);
            res[i] = i - pos;
            //System.out.println(res[i]);
        }
        for (int i = n - 1; i >= 0; --i) {
            if (s.charAt(i) == ch)  pos = i;
            //System.out.println(pos);
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }

        System.out.println(Arrays.toString(res));
			
		}

	}


