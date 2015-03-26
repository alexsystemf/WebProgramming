public class NewExceptionTest {
	public void thrower() throws NewException {
		if (Math.random() < 0.5) {
			throw new NewException("This is my exception");
		}
	}
	 
	public static void main(String[] args) {
		NewExceptionTest t = new NewExceptionTest();
		try {
			t.thrower();
		}
		catch(NewException e) {
			System.out.println("New Exception: " + e.getMessage());
		}
		finally {
			System.out.println("Done");
		}
	}
}