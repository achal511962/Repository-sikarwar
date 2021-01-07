package InheritanceFst;

public class MainAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal("Animal", 1, 1, 5, 5);

		Dog dog = new Dog("Jokey", 8, 20, 2, 4, 1, 20, "Long Siliky");
		
		dog.eat();
		//dog.walk();
		//dog.run();

	}

}
