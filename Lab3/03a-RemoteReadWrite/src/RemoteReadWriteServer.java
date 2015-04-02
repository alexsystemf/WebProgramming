import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;



public class RemoteReadWriteServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {

			//Inet4Address addr = null;
			//addr = (Inet4Address) Inet4Address.getLocalHost();
			//serverSocket = new ServerSocket(DateTimeProtocol.SERVER_PORT,0,addr);

			serverSocket = new ServerSocket(RemoteReadWriteProtocol.SERVER_PORT);
			System.out.println(Inet4Address.getLocalHost());
			System.out.println(serverSocket);

		} catch (IOException e) {
			System.out.println("Could not listen on port:" + RemoteReadWriteProtocol.SERVER_PORT);
			System.out.println(e.toString());
			System.exit(1);
		}

		Socket clientSocket = null;
		while(true) {
			try {

				clientSocket = serverSocket.accept();
				System.out.println("Received connection from " + 
						clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());

				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
				
				String request1 = br.readLine();
				System.out.println("request1 = " + request1);
				if (request1.equals(RemoteReadWriteProtocol.REQUEST_TO_WRITE)) {
					pw.println(RemoteReadWriteProtocol.ACCEPT_REQUEST_TO_WRITE);
					
					String request2 = br.readLine();
					System.out.println("request2 = " + request2);
					FileWriter fw = new FileWriter("src/Users.txt", true);
					fw.write(request2+"\n");
					fw.close();
					
					
				}
				
				br.close();
				pw.close();
				clientSocket.close();
			} catch (IOException e) {
				System.err.println("Failure" + e.toString());
			}


		}






	}
}




