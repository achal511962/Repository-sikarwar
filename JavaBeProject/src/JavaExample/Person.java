package JavaExample;

public class Person {
  private int age; 
  private String name;
  
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
	
	 if (age >= 0) {
	        this.age = age;
	 } else {
		System.out.println("Use Valid Age."); 	
		  
	 }
	 
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
}
