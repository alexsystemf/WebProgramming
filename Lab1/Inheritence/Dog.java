
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	//Override the abstract method and make dogs to bark.
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
	}
	
	@Override
	public void act() {
		System.out.println("Acting as a dog!");
	 }
	
	
	
}
