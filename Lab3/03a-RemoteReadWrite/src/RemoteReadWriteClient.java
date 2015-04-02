import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class RemoteReadWriteClient {
	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out.println("Usage java DateTimeClient <hostname or ip address>");
				System.exit(0);
			}
			InetAddress ia = InetAddress.getByName(args[0]);
			Socket socket = new Socket(ia, RemoteReadWriteProtocol.SERVER_PORT);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw.println(RemoteReadWriteProtocol.REQUEST_TO_WRITE);
			String response1 = br.readLine();
			System.out.println("response1 = " + response1);
			if (response1.equals(RemoteReadWriteProtocol.ACCEPT_REQUEST_TO_WRITE)) {
				String response2 = "pkotzani Kotzanikolaou Panos Informatics";
				System.out.println("response2 = " + response2);
				pw.println(response2);
				
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
