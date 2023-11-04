//package PackageServer;
//
//class IXServer {
//	String hostName = "IX800 Server";
//	int portNum = 9712;
//	
//	public int getPortNum() {
//		return portNum;
//	}
//	public void setPortNum(int portNum) {
//		this.portNum = portNum;
//	}
//	IXServer(){}
//	void setHostNmae(String strHostName) {
//		hostName = strHostName;
//	}
//	String getHostName() {
//		return hostName;
//	}
//	void printServerInfo() {
//		System.out.println("hostName" + getHostName() +" portNum" + getPortNum());
//	}
//}
////=======서로 다름 파일로 만들어도됨======
//class IXServerTest {
//	public static void main(String[] args) {
//		System.out.println("Server Test..");
//		IXServer server = new IXServer();
//		server.printServerInfo();
//		
//		System.out.printf("%x", System.identityHashCode(server));
//	}
//}
