
public class ThrowsExample {
	private int age;

	
	
	public void setAge(int age) throws IllegalArgumentException {
		if (age < 0) {
			throw new IllegalArgumentException("Age must be >= 0");
		}
		
		else {
			this.age = age;
			System.out.println("You set the age to " + this.age + " years.");
			
		}
	}
	
	
	
	public static void main(String args[]){
		ThrowsExample t = new ThrowsExample();
		t.setAge(3);
		t.setAge(-1);
		
	}
	
	
	
}
