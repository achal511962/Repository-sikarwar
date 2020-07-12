package testingEmpSal;

public class Employee {    /// Class name
	
	int empID;                  // data name
	String empName;   			// data name
	double empSalary;			// data name
	double empBonus;			// data name
	double empTotalPay;			// data name
	
	void calculateToralPay() {           // Method name
		empTotalPay = empSalary + empBonus;
	}

}
