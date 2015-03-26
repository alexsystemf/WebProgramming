import java.util.Scanner;


public class TryCatchFinallyTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		try {
			System.out.println("Enter your name: ");
			name = input.nextLine();
			
			System.out.println("Enter your age: ");
			age = input.nextInt();
			
			System.out.println("Hello " + name);
			System.out.println("You are " + age);
		}
		catch (NumberFormatException e) {
			System.out.println("Number Format Exception occurred");
		}
		catch (Exception e) {
			System.out.println("General Exception occurred");
		}
		finally {
			System.out.println("Goodbye");
		}
	} 
}
