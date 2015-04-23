
public class ThreadTest {
	public static void main(String args[])
	{
	// this is where the program starts

	System.out.println("Constructing the thread...");
	// create the thread
	ThreadExample count = new ThreadExample();
	
	System.out.println("Starting the thread");
	// start the thread running
	count.start();
	System.out.println("The thread has been started.");
	// we're finished here
	System.out.println("The main() method is finishing.");
	return;
	}
}
