package JavaExample;

import java.util.Scanner;
public class GreaterTh2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Two Numbers.");
		
		int A,B;
		A = kb.nextInt();
		B = kb.nextInt();
		
		if(A>B)
		  System.out.println(A+ "is greater");
		else if(B>A) 
		  System.out.println(B+ "is greater");	
		else
		  System.out.println(A+ "And" +B+ "are equals.");	
	}  

}
