package testingEmpSal;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee Alex = new Employee();      // Object/Records name
        Alex.empID = 100;
        Alex.empName = "Alex";
        Alex.empSalary = 80345.78;
        Alex.empBonus = 20000;
        Alex.calculateToralPay();
        System.out.println("Alex total pay=" + Alex.empTotalPay);
        
        Employee Lynda = new Employee();          // Object/Records name
        Lynda.empID = 200;
        Lynda.empName = "Lynda Barren";
        Lynda.empSalary = 90000;
        Lynda.empBonus = 20000; 
        Lynda.calculateToralPay();
        System.out.println("Lynda total pay=" + Lynda.empTotalPay);
            
	
	}

}
