import java.util.Scanner;

public class ExceptionTest1 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double i, x, y;
		try {
		  
			x = input.nextDouble();
			y= input.nextDouble();
			i = x/y;
			System.out.println("x/y = " + i);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception!");
		}
		
		finally{
		System.out.println("Done with test");
		}
		
	 	}
}
