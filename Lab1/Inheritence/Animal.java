
public abstract class Animal {
	
	private String name;

	//Constructor that sets the name attribute   
	public Animal(String name) {
		this.name = name;
	}
	
	//Returns the name
	public String getName() {
		return name;
	}

	//Declares the behavior
	 public void act() {
		 System.out.println("Acting as an animal!");
	 }
	 
	 //We don't know what language speaks each animal. 
	 //We make this abstract so that the subclass will define speak()
	 public abstract void speak();

	
	
	
	public static void main(String[] args) {
		
		Animal a = new Dog("Rocky");
		System.out.println("The animal " +a.getName() + " was created!");
		a.act();
		a.speak();
		
		Cat b = new Cat("Kitty");
		System.out.println("The animal " + b.getName() + " was created!");
		b.act();
		b.speak();
		
		b.act("This is an overloaded version method of act. ");
		
		


		
	}
}
