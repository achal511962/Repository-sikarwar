package BankAccount;

public class Account {
	private  String number;  // accountNumber  SinghSikarwar_Branch_ABC20
	private double balance;  // accountBalance           Sikarwar-Branch-ABC30
	private String customerName;      // Sikarwar-Branch-ABC40
	private String customerEmailaddress;
	private String customerphone; 
	
	public Account() {
		this("54321", 0.00 ,"Default name","Default Emailaddress","Default Phone"); // assign Default value to constructor.
		System.out.println("Empty Contructor called.");
	}
	
	public Account(String numbre, double balance,String customerName, String customerEmailaddress, String customerphone ) {
		
		System.out.println("Account Contructor with parameter called.");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailaddress = customerEmailaddress;
		this.customerphone = customerphone;
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount; 
		System.out.println(" deposit of " + depositAmount + " made. New balance is  " +this.balance );
	}
	
	public void withdrawal(double withdrawalAmount) {
	   if(this.balance - withdrawalAmount <=0) {
		  System.out.println(" Only " + this.balance + " available. Withdrawal not possiable. " ); 
	   } else {
		   this.balance -= withdrawalAmount;
		   System.out.println(" Withdrawal of " + withdrawalAmount + " processed. Remaining balance =  " + this.balance);
	   }	
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailaddress() {
		return customerEmailaddress;
	}
	public void setCustomerEmailaddress(String customerEmailaddress) {
		this.customerEmailaddress = customerEmailaddress;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	
}
