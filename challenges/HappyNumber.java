package challenges;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num = 19;
         int result= num;
         while(result !=1 && result != 4 ) {
        	 result = isHappyNumber(result);
         }
                  
         if (result == 1) {
        	 System.out.println("The number \t" + num + "\t happy number");
         } else if (result == 4){
        	 System.out.println("The number \t" + num + "\t is not happy number");
         }
                 
	}
	
	public static int isHappyNumber(int input) {
		int sum = 0;
        while(input > 0 ) {
       	 int rem = input % 10;
       	 sum = sum + (rem*rem);
       	 input = input/10;
            }
        return(sum);
		
	}

}
