package week3.day1;

public class Automation extends MultipleLanguage implements Language,Testtool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Automation automate = new Automation();
        automate.selenium();
        automate.python();
        automate.ruby();
        automate.java();
	}

	public void selenium() {
      System.out.println("Selenium");		
	}

	public void java() {
	  System.out.println("java");
		
	}

	@Override
	public void ruby() {
	  System.out.println("ruby");
		
	}

}
