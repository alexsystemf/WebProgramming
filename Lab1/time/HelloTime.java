import java.util.Scanner;
public final class HelloTime {

	
	
	public static void main(String[] args) {
		
		myTime t1 = new myTime();
		System.out.println(t1);
		
		myTime t2 = new myTime(23,10,59);
		System.out.println(t2);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Now we will change the object t2. Give hour:");
		t2.setHour(input.nextInt());
		System.out.println("\nGive minute:");
		t2.setMinute(input.nextInt());
		System.out.println("\nGive second:");
		t2.setSecond(input.nextInt());
		System.out.println("\nThis is the new t2 object:");
		System.out.println(t2);
	}
	

}
