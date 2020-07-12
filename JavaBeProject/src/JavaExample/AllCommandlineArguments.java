package JavaExample;

import java.util.Scanner;

public class AllCommandlineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner kb = new Scanner(System.in);
	    int i =kb.nextInt();
	    
        for(i=0;i<args.length;i++)
       {
    	   System.out.println("CommandlineArguments " +args[i]);
       }   
		/*
		 * if(args.length==2) 
		 * { int a = Integer.parseInt(args[0]); 
		 * int b =
		 * Integer.parseInt(args[1]);
		 *  int c =a+b; }
		 */
	}

}
