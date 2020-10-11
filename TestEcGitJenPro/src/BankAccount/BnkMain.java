package BankAccount;

public class BnkMain {

	public static void main(String[] args) {
		
		Account bobsAccount = new Account(); //"12345", 0.00, "Bob Brawn", "bobs@test.com", "99-2100-0477");	Assigned value 
		   // to constructor.
		  System.out.println(bobsAccount.getNumber());    // Sikarwar-Branch-ABC40
		  System.out.println(bobsAccount.getBalance());
		  System.out.println(bobsAccount.getCustomerName());
		  System.out.println(bobsAccount.getCustomerEmailaddress());
		  System.out.println(bobsAccount.getCustomerphone());
		  
		/*
		 * bobsAccount.setNumber("12345"); bobsAccount.setBalance(0.00);
		 * bobsAccount.setCustomerName("Bob Brawn");
		 * bobsAccount.setCustomerEmailaddress("bobs@test.com");
		 * bobsAccount.setCustomerphone("99-2100-0477");
		 */
		
		
		bobsAccount.withdrawal(100.00); 
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);

	}

}
