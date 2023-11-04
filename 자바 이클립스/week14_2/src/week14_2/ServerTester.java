package week14_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class IServer{
	static Map<String, String> db = new HashMap<String,String>();
	ServerSocket server = new ServerSocket();
	boolean bRun =true;

	IServer() throws IOException{
		db.put("map", "지도");
		db.put("inha", "인하");
		server.bind(new InetSocketAddress("localhost", 5000));
		System.out.println("[Server] Start");
	}
	void start() throws IOException {
		while(bRun) {
			Socket socket = server.accept();
			System.out.println("[Server] Connect");
			//InputStream is = socket.getInputStream();
			//OutputStream os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			String str = dis.readUTF();
			if(str.equals("server_os")) {
				dos.writeUTF(System.getProperty("os.name"));
			} else if(str.equals("server_arch")) {
				dos.writeUTF(System.getProperty("os.arch"));
			} else if(str.equals("server_time")) {
				Date now = new Date(System.currentTimeMillis());
				dos.writeUTF(now.toString());
			}else if(str.equals("bye")){
				bRun=false;
				dos.writeUTF("bye");
			}else {
				String result =db.get(str);
				dos.writeUTF(result);
			}
			System.out.println(str);
			
			dis.close();
			dos.close();
			socket.close();
		}
	}
	void stop() throws IOException {
		server.close();
		System.out.println("[Server] Terminated");
	}
}

public class ServerTester {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new IServer().start();
	
	}

}
