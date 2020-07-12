package JavaExample;

import java.util.Scanner;

public class CalSumOfNOddNatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	    int N =kb.nextInt();
	    int S=0,i,j;
	    
	    System.out.println("Print Sum of Odd Num ");  
        for(j=1;j<=N;j++)
        {
     	  S=S+(2*j-1); 
        }
         System.out.println("Sum of Odd Num " +S);
          S++;
	}
//  2 4 6 8 = 20  1 3 5 7 = 16
}
