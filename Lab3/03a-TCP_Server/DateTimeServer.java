package netprog.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {


	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(DateTimeProtocol.SERVER_PORT);
        } catch (IOException e) {
            System.out.println("Could not listen on port:" + DateTimeProtocol.SERVER_PORT);
            System.out.println(e.toString());
            System.exit(1);
        }

        Socket clientSocket = null;
        while(true) {
        	try {

        		clientSocket = serverSocket.accept();
        		System.out.println("Received connection from " + 
        				clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());

        		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        		String request = in.readLine();
        		if (request.equals(DateTimeProtocol.REQUEST_TIME)) {
        			Date d = new Date();
        			out.println(d.toString());
        		}
        		in.close();
        		out.close();
        		clientSocket.close();
        	} catch (IOException e) {
        		System.err.println("Failure" + e.toString());
        	}

        }
            
        
        
	}

}
