package Array.test;

public class Arraytest {

	public static void main(String[] args) {
		int[] myIntArray = new int[10]; // {1,2,3,4,5,6,7,8,9,10}
	//	myIntArray[0] = 23;
	//	myIntArray[1] = 33;
	//	myIntArray[2] = 43;
	//	myIntArray[3] = 53;
	//	myIntArray[4] = 63; 
	
	
	for(int i = 0; i<myIntArray.length; i++) {
		myIntArray[i] = i*10;
	}	
	for(int i = 0; i<30; i++) {
		System.out.println(" Element " + i + " value is " +myIntArray[i]);
	} 
	
	}

}
