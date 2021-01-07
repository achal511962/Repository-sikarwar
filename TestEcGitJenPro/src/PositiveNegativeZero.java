
public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(1);
	   // int number = 1;
	    
	}
	
	public static void checkNumber(int number) {
		
		if(number>0) {
			System.out.println("Positive");
		}		
		else if (number<0) {
			System.out.println("Negative");
		}else if (number==0) {
			System.out.println("Zero");
		}
	}

}
