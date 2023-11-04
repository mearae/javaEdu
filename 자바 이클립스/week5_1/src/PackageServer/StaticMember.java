package PackageServer;

import java.util.Scanner;

class CurrencyConverter {
	static double rate = 0;
	static void setRate(double a){
		rate = a;
	}
	static double toKWR(double b) {
		return b * rate;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); // 미국 달러 환율 설정
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
	}
}
