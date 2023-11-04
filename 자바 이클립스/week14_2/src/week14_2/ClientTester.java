package week14_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("localhost",5000));
		System.out.println("[Client] Start");
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		dos.writeUTF("bye");
		String str=dis.readUTF();
		System.out.println(str);
		
		dis.close();
		dos.close();
		socket.close();
		System.out.println("[Client] Terminated");
	}

}
