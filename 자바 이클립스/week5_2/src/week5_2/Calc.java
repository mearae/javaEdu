//package week5_2;
//
//public class Calc {
//	int arg1;
//	int arg2;
//	
//	Calc(){
//		this(1,1);
//	}
//	Calc(int arg1){
//		this(arg1,1);
//	}
//	Calc(int arg1, int arg2){
//		this.arg1 = arg1;
//		this.arg2 = arg2;
//		System.out.println("Constrructor call");
//	}
//	int getSum(int a, int b) {
//		return a + b;
//	}
//	double getSum(int a, double c) {
//		return a + c;
//	}
//	
//	void printResult() {
//		System.out.println(arg1);
//		System.out.println(arg2);
//	}
//	
//	public static void main(String[] args) {
//		Calc calc = new Calc(3);
//		calc.printResult();
//	}
//}
