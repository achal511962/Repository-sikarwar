package BankAccount;

public class VipPerson {

	private String name;
	private double creditlimit;
	private String emailAddress;
	
	public VipPerson() {
		this("defult name", 50000.00,"test@abc.com");
	}
	
	public VipPerson(String name,double creditlimit) {
		//this.name=name;
		//this.creditlimit=creditlimit;
		this(name, creditlimit,"unknown@email.com");
	}
	
	public VipPerson(String name,double creditlimit,String emailAddress) {
		this.name=name;
		this.creditlimit=creditlimit;
		this.emailAddress=emailAddress;
	}
	
}
