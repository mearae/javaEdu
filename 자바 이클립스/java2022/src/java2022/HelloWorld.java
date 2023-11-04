package java2022;
import java.util.Arrays;
import java.util.Scanner;

class asdf{
	int a=0;
	static int b=1;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	asdf(int a,int b){
		this.a=a;
		this.b=b;
	}
	asdf(int a){
		this(a,1);
	}
	static void printB() {
		System.out.println(b);
	}
	void printA() {
		System.out.println(a);
	}
}

public class HelloWorld {
	public static void someFunction() {
		try {
			throw new Exception("MyException");
		}
		catch (Exception e) {
			System.out.println("caught in callee");
		}
		finally {
			System.out.println("finally in callee");
		}
	}

	public static void main(String[] args) {
		enum ex{FIR,SEC,THR,FOU};
		System.out.println(ex.FIR.name());
		System.out.println(ex.FIR.ordinal());
		for(ex e : ex.values()) {
			System.out.print(e+" ");
		}
		System.out.println();
		asdf ad =new asdf(1,2);
		System.out.printf("%x",System.identityHashCode(ad));
		System.out.println();
		asdf as[]=new asdf[5];
		for(int i = 0; i<as.length;i++) {
			as[i]=new asdf(i,2);
			System.out.print(as[i].getA()+" ");
		}
	}

}
