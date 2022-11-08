package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 407;
		int calnum = 407;
		
		int sum = 0;
		while (calnum > 0) {
			int rem = calnum % 10;//we get 5
			sum += (rem*rem*rem) ;// we get 125+27
			  calnum = calnum/10;
			  			
		}
		//System.out.println(sum);
		if (sum == num ) {
			System.out.println("The number \t " +num +"\t is Armstrong number");
		}else {
			System.out.println("The number \t " +num +"\t is NOT Armstrong number");
		}
		
      
	}

}
