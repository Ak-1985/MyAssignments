package week1.day1;

public class Mobile {
	String mobileBrandName = "Apple" ;
	char mobileLogo = 'A' ;
	short noOfMobilePiece = 2;
	int modelNumber = 157754;
	long mobileImeiNumber = 874157454L;
	float mobilePrice = 56000.54F;
	boolean isDamaged = false;

	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		System.out.println(myMobile.mobileBrandName);
		System.out.println(myMobile.mobileLogo);
		System.out.println(myMobile.noOfMobilePiece);
		System.out.println(myMobile.modelNumber);
		System.out.println(myMobile.mobileImeiNumber);
		System.out.println(myMobile.mobilePrice);
		System.out.println(myMobile.isDamaged);

	}

}
