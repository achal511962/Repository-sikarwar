package JavaExample;

public class AnmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog D1 = new Dog();
       
       D1.eat();
       D1.sleep();       
       D1.bark(); 
       
       D1.type = "mammal";
       D1.setColor("Black");
       D1.displayInfo(D1.getColor());
	}

}
