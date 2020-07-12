/* Relation between Class and Interface –
As shown in the figure given below,
 a class extends another class, 
an interface extends another interface 
but a class implements an interface
  */

interface Bank {
    float rateOfInterest();
}
 
class SBI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.15f;
    }
}
class ICICI implements Bank {
 
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class JavaApplication4 {

	public static void main(String[] args) {
		 
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
 
    }
}
