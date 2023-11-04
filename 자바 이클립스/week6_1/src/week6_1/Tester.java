package week6_1;

public class Tester {
	public static void main(String[] args) {
		LGCamera c1 = new LGCamera("cam1", "LG");
		
		SamsungCamera c2 = new SamsungCamera("cam2","Samsung");
		
		Camera cam = c2;
		cam.MoveLeft();
		cam=c1;
		cam.printInfo();
	}
}
