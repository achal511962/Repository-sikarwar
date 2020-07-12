package JavaExample;

import java.util.Scanner;

public class Nodetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		    //Node nd=new Node(); 
		   
		   NLinkedList list = new NLinkedList();
		   boolean flag=true; 
	        while(flag) {
	        	System.out.println("Add iten to the List at Start.");
	        	System.out.println("Add iten to the List at End.");
	        	System.out.println("Add iten from the at given position.");
	        	System.out.println("Delete iten in the List of First value.");
	        	System.out.println("Delete iten in the List of Last value.");
	        	System.out.println("Delete iten from the at given position.");
	        	System.out.println("View List Value.");
	        	System.out.println("Enter your choice.");
	              
	        int choice = sc.nextInt();    
	        int position,val;
	        
	        switch(choice) {
	        case 1 : 
	        	System.out.println("Enter value of List item.");
	        	     val = sc.nextInt();
	        	     list.insertAtFirst(val);
	        	     break;
	        case 2 :
	        	System.out.println("Enter value of List item.");
	        		 val = sc.nextInt();
	   	             list.insertAtLast(val);
	   	             break;
	   	    case 3 : 
	   	    	System.out.println("Enter Position.");
	            position= sc.nextInt(); 
	            System.out.println("Enter value of List item.");
	            val =sc.nextInt();
	            list.insertAtPos(val,position);
	            break; 
	        case 4 : 
	        	      list.deleteFirst();
	        	      break;
	        case 5 : 
	        	      list.deletelast();
	        	      break;
	        case 6 : 
	           System.out.println("Enter Position.");
	                  position= sc.nextInt();
	                  list.deleteAtPos(position);
	                  break;
	        case 7 :   
	        	      list.viewList();   
	        	      break;
	        case 8  :
	        	      flag=false;
	       default :
	    	   System.out.println("Invalid Choice.");
	        }
	        	
		   }
	             
	}

}
