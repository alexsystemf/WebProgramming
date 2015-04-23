import java.net.*;
import java.io.*;
public class ConcurrentEchoServer implements Runnable
{
	private BufferedReader myReader = null;
	private PrintWriter myWriter = null;
	private Socket mySocket = null;

	public ConcurrentEchoServer (Socket mySocket)
	{
		try
		{
			this.mySocket = mySocket;
			myReader = new BufferedReader(new 
					InputStreamReader(mySocket.getInputStream()));
			myWriter = new PrintWriter(mySocket.getOutputStream(), true);
		}
		catch (IOException e)
		{
			System.out.println("Exception accessing socket streams: "+e);
		} 
	}
	public void run()
	{
		while (true)
		{
			try
			{
				String line = myReader.readLine();
				System.out.println("The server received: " + line);
				myWriter.println(line.toUpperCase());
				System.out.println("The server send: " + line.toUpperCase());
			}
			catch (Exception e)
			{
				myWriter.println("Server exception: "+e);
			}
		}
	}

	public static void main(String argv[])
	{
		int port = 8888;
		ServerSocket myServerSocket = null;
		if (argv.length == 1)
		{
			try
			{
				port = Integer.parseInt(argv[0]);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Usage: ConcurrentEchoServer <port>");
				System.exit(1);
			}
		}
		System.out.print("Starting ConcurrentEchoServer at port: "+port+"..");

		try
		{
			myServerSocket = new ServerSocket(port);
		}
		catch (IOException e)
		{
			System.out.println("Exception when creating ServerSocket: "+e);
			System.exit(1);
		}
		System.out.println("...started.");

		while (true) {
			try {
				new Thread (new ConcurrentEchoServer(myServerSocket.accept())).start();
				
			} catch (IOException e) {
				System.out.println("Something terrible happened: " + e);
				System.exit(1);
			}
		}
	}
}
