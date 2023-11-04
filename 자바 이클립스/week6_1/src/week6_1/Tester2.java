package week6_1;

class Base { 
	Base() { 
		System.out.println("Base constructor"); 
	}
	void fun() { 
		System.out.println("Base fun()"); 
	} 
} 

class Derived extends Base { 
	Derived() { 
		System.out.println("Derived constructor"); 
	} 
	void fun() { 
		System.out.println("Derived fun()"); 
	} 
}

public class Tester2 {
	public static void main(String[] args) {
		Base b = new Derived();
		b.fun();
	}
}
