package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		while (count < 8) {
			System.out.println("Fibonacci Series:"+num1+"");
			int sum = num1 +num2;
			num1 = num2;
			num2 = sum;
			count++;
			
		
				
			
		}

	}

}
