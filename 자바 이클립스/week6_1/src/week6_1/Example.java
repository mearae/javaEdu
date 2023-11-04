package week6_1;

class A {
	public A() {
		this(0);
		System.out.println("A");
	}
	public A(int x) { 
		System.out.println("A" + x); 
	}
}

class B extends A {
	public B() {
		super(100);
		System.out.println("B" + 100);
	}
	public B(int x) {
		this();
		System.out.println("B" + x);
	}
}

public class Example {
	public static void main(String[] args) {
		B b = new B(10);
	}
}
