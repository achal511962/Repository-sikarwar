package JavaExample;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	
	  int i; 
	  for(i=1;i<=10;i++) 
	  System.out.print(" " +i);
	
		  
	System.out.print(" Print natural number. ");	
	  Scanner kb =new Scanner(System.in);
	  int N =kb.nextInt();
	  for(int j=1;j<=N;j++) 
	  System.out.println(" PNN " +j);	
	  
	  System.out.print(" Natural number in Reverse order. ");  
      
	  while(N>0)
	  {
		System.out.println(N+ "Reverse order" );
		System.out.println("--------------");
		System.out.println("-" +N  );
	     N--;
	  }
	}
}
