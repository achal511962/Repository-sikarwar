package JavaExample;

import java.util.Scanner;

public class PrintOddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner kb = new Scanner(System.in);
     int N =kb.nextInt();
     for(int i=1;i<=N;i++)
    	System.out.println("Odd Number:- " +(2*i-1)); 
 
     System.out.println("=========kkk============"); 
     for(int k=1;k<=N;k++) 
    	System.out.println("Even Number :- " +2*k);
     
	}

}
