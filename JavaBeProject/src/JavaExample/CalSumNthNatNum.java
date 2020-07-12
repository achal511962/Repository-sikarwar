package JavaExample;

import java.util.Scanner;

public class CalSumNthNatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	     int N =kb.nextInt();
	     int S=0;
	     for(int i=1;i<=N;i++)
	    	S=S+i; 
	      System.out.println(" Sum of N Num-" +S);	 
	}

}
