import java.util.Scanner;


public class myInput {

	myInput(){
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner (System.in);
		
		System.out.println("Give an integer:");
		int i = input1.nextInt();
		System.out.println("You gave: "+i + ".\n");
		
		System.out.println("Give a line: ");
		String s = input2.nextLine();
		System.out.println("You gave the line: " + s);
		
	}
		
}
