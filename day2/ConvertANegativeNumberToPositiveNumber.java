package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =-40;
		if (num < 0 ) {
			System.out.println("Number\t"+num+"\t is negative");
			num = num * -1;
			System.out.println("Converted number is\t"+num);
		}else {
			System.out.println("Number is positive\t " + num);
		}
		

	}

}
