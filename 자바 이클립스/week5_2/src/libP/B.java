package libP;

public class B {
	A a;
	void printB() {
		a = new A();
		//System.out.println(a.privateVar);
		System.out.println(a.delfaultVar);
		System.out.println(a.protectedVar);
		System.out.println(a.publicVar);
	}
}
