package com.calculator.Debug;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Calculator c = new Calculator();
		
		int addResult = c.addition(10, 20);
		System.out.println("Addition Result -" + addResult );
		
		int mulResult = c.multiplication(10, 20);
		System.out.println("Addition Result -" + mulResult );
		
		int subResult = c.subtraction(100, 20);
		System.out.println("Addition Result -" + subResult );
		
		int divResult = c.divide(100, 20);
		System.out.println("Addition Result -" + divResult );
		
	}

}
