

public class FinalValues {
	final int f1 = 1; //final at compile-time
	
	final int f2;
	{
		f2 = 2; //final at compile-time
	}
  
	final int f3;
	
	public FinalValues(int i) { //final at run-time
		f3 = i;
        final int f4 = i;
        System.out.println("In constructor, f4 = " + f4);
	}
	
	public void useFinalParameter(final int f5) {
		System.out.println("f5 = " + f5);
	}
	
	public void printAll() {
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
	}    

	public static void main(String[] args) {
		FinalValues fv = new FinalValues(3);
		fv.useFinalParameter(5);
		fv.printAll();
	}
}
