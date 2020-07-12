package JavaExample;

import java.util.Scanner;

public class CheckForPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number.");
		Scanner kb = new Scanner(System.in);
	    int N =kb.nextInt();
	    
	    if(N>=1)
	    {  
		    int i;
		    for(i=2;i<N;i++)
		  
		    if(N%i==0)
		      break;
		   
		    if(i==N)
		     System.out.println("Number is Prime.");
		    else
		     System.out.println("Number is not Prime");	
		}
	    else
	    {
	      System.out.println("Please Enter Valid Value.");
	    }	
	 }
}
