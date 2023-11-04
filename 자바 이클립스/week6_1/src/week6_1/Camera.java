package week6_1;

import java.util.Arrays;

public class Camera {
	String strName;
	
	public Camera(){
		this.strName = "default";
	}
	
	public Camera(String strName){
		this.strName = strName;
	}
	
	void printVendor() {}
	void printInfo() {
		System.out.println(strName);
		printVendor();
	}
	
	void sendData(byte[] data) {
		System.out.println(Arrays.toString(data));
	}
	void MoveLeft() {
		System.out.println("Bad");
	}
}
