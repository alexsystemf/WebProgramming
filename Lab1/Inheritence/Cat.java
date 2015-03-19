
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Meow");
	}

	public void act() {
		System.out.println("Acting as a cat!");
	 }
	
	public void act(String message){
			System.out.println(message + getName() + " is acting like a cat!" );
		}
	
	
}
