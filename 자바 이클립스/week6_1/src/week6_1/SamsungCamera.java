package week6_1;

public class SamsungCamera extends Camera{
	String strVendor;
	
	SamsungCamera(String strName, String strVendor){
		super(strName);
		this.strVendor = strVendor;
	}
	@Override
	void printVendor() {
		System.out.println(strVendor);
	}

	void MoveLeft() {
		byte[] bytes = new byte[3];
		bytes[0]=0x01;
		bytes[1]=0x02;
		bytes[2]=0x0f;
		sendData(bytes);
	}

}
