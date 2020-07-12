package JavaExample;

class Aanimal {
    // protected method
    protected void display() {
        System.out.println("I am an animal.");
    }
}

class MainAM extends Aanimal  {

	public static void main(String[] args) {
		  // create an object of Dog class
		MainAM mnNew = new MainAM();
		  Dog dog = new Dog();
         // access protected method
        //dog.display();
        mnNew.display();
        //dog.displayInfo(c);
	}

}
