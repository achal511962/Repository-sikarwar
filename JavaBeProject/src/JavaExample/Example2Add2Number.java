package JavaExample;

import java.util.Scanner;

public class Example2Add2Number {
	
	public static void main(String[] args) {
		
	int A=10;
	int B=20;
	int C;	
		C=A+B;	
	System.out.println("Sum of  "+A+" and "+B+" is "+C); 
	
	Scanner kb = new Scanner(System.in); 
	System.out.println("Enter 2 number."); 
	int X = kb.nextInt();
	int Y = kb.nextInt();
	int Z = X+Y;
		
	System.out.println("Sum of "+X+" and "+Y+" is "+Z);
	
	System.out.println("Enter the length and breadth of Rectangle."); 
	
	/*
	 * int Le = kb.nextInt(); 
	 * int Br = kb.nextInt(); 
	 * int Area = Le*Br;
	 */
	int Area=X*Y;
	System.out.println("Area of Rectangle:" +Area); 
	
}
}