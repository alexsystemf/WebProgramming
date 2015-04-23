import java.net.*;
import java.io.*;

public class ConcurrentEchoClient {

	public static void main(String[] args) {
		String hostname = args[0];
		int port = Integer.parseInt(args[1]);

		Socket connection = null;
		try {
			connection = new Socket(hostname, port);
		} catch (IOException ioe) {
			System.err.println("Connection failed");                    
			return;
		}




		try {
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(
									connection.getInputStream()));
			PrintWriter writer = 
					new PrintWriter(
							new OutputStreamWriter(
									connection.getOutputStream()), true);

			System.out.println("The client sends: " + args[2]);
			writer.println(args[2]); // client name
			String reply = reader.readLine();
			System.out.println("Server reply: "+reply);
		
		} catch (IOException ioe1) {
		}
	}
}
