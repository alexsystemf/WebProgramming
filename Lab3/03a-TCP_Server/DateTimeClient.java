package netprog.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateTimeClient {

	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out.println("Usage java DateTimeClient <hostname or ip address>");
				System.exit(0);
			}
			InetAddress ia = InetAddress.getByName(args[0]);
			Socket socket = new Socket(ia, DateTimeProtocol.SERVER_PORT);
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw.println(DateTimeProtocol.REQUEST_TIME);
			String response = br.readLine();
			if (response != null) {
				System.out.println(response);
			}
			
			pw.close();
			br.close();
			socket.close();
		} catch(UnknownHostException uhe) {
			System.out.println("Unknown host: " + args[0]);
		} catch(Exception e) {
			System.out.println("Exception:" + e.toString());
		}
	}
}
