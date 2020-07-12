package JavaExample;

import java.util.Scanner;

public class CalFactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number.");
		Scanner kb = new Scanner(System.in);
	    int N =kb.nextInt();
	    
	    if(N>=1)
	    {
		    int F=1; 
		    while(N!=0)
		    {
		    	F=F*N;
		    	N--;
		    }
		    System.out.println("Fact Value  " +F);
		   }
	    else
	    {
	       System.out.println("Please Enter Valid Value.");
	    }
  }
}