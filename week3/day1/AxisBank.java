package week3.day1;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AxisBank bank = new AxisBank();
        bank.savings();
        bank.fixed();
        bank.deposit();
	}
	
	public void deposit() {
		System.out.println("Deposit is in this method");
	}

}
