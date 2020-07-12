package JavaExample;

public class Animal {
	
	protected String type = "Animal";
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void eat() {
	      System.out.println("I can eat.");
	   }

    public void sleep() {
	      System.out.println("I can sleep");
	   }
	}

class Dog extends Animal {
	  
	@Override
	public void eat() {
		super.eat();  
		System.out.println("I can eat Dog Food.");
	   }  
	public void bark() {
	      System.out.println("I can bark");
	   } 
	   
	   public void displayInfo(String c) {
		      System.out.println("I am a " +type);
		      System.out.println("My color is " + c);
		   }
	}
