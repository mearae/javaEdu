package libP;

public class A {
	private int privateVar = 1;
	int delfaultVar = 2;
	protected int protectedVar = 3;
	public int publicVar = 4;
	
	public void printA() {
		System.out.println(privateVar);
		System.out.println(delfaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
}
