package MasterClassTest;

import java.util.Scanner;

public class ArrayPro {

	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] myIntArray = {0,1,2,3,4,5,6,7,8,9,10};  //new int[10];
		//myIntArray[0] = 50;
		//myIntArray[1] = 55;
		//myIntArray[2] = 60;
		System.out.println(myIntArray[1]); 
		
		System.out.println("==========11================="); 
		
		double[] myDoubleArray = new double[10];
		myDoubleArray[5] = 50;
		System.out.println(myDoubleArray[5]); 
		
		System.out.println("=============22=============="); 
		
		for(int i=0; i<myIntArray.length; i++)
		{
			myIntArray[i] = i*10;
			System.out.println("Element "+ i + "Value is" +myIntArray[i]); 	
		}
		System.out.println("==============33============="); 
	} 	
		
		public static void printArray(int[] array) {
			for(int i=0;  i <array.length; i++) {
			System.out.println("***Element*** "+ i + "Value is" +array[i]); 	
		}
		
	}		

}
