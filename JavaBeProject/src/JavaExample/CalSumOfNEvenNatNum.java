package JavaExample;

import java.util.Scanner;

public class CalSumOfNEvenNatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	    int N =kb.nextInt();
	    int S=0,i,j;
       for(i=1;i<=N;i++)
       {
    	  S=S+2*i; 
       }
        System.out.println("Sum of even Num " +S);
         S++;         
	}
 //  2 4 6 8 = 20  1 3 5 7 = 16
}
