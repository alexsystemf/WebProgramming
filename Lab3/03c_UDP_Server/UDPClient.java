
import java.io.*;
import java.net.*;

class UDPClient {

    public static void main(String args[]) throws Exception {
        try {
            String serverHostname = "127.0.0.1";

            byte[] sendData = "socket udp".getBytes();
            DatagramSocket clientSocket = new DatagramSocket();

            InetAddress IPAddress = InetAddress.getByName(serverHostname);
            System.out.println("Attemping to connect to " + IPAddress + ") via UDP port 9876");


            byte[] receiveData = new byte[10];
            System.out.println("Sending data to " + sendData.length
                    + " bytes to server.");
            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);

            System.out.println("Waiting for return packet");
            clientSocket.setSoTimeout(10000);

            try {
                clientSocket.receive(receivePacket);
                String modifiedSentence =
                        new String(receivePacket.getData());

                InetAddress returnIPAddress = receivePacket.getAddress();

                int port = receivePacket.getPort();

                System.out.println("From server at: " + returnIPAddress
                        + ":" + port);
                System.out.println("Message: " + modifiedSentence);

            } catch (SocketTimeoutException ste) {
                System.out.println("Timeout Occurred: Packet assumed lost");
            }

            clientSocket.close();
        } catch (UnknownHostException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
