import java.util.Scanner;
public final class HelloOutput {

	
	
	public static void main(String[] args) {
		
		myClass myClassObject1 = new myClass("Hello word!");
		
		myClass myClassObject2 = new myClass("Hello word!", "This is the second constructor");
	//	myClassObject2.setMyClass("test message");
		
		
		System.out.println(myClassObject1.getMyClass());
		System.out.println(myClassObject2.getMyClass());
		
		myClassObject2.setMyClass("Changing Object2");
		System.out.println(myClassObject2.getMyClass());
		
		System.out.printf("%s", myClassObject1.toString());
		System.out.printf("%s", myClassObject2);
		
	}

}
