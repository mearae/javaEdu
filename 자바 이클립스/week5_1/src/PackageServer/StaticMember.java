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
		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); // �̱� �޷� ȯ�� ����
		System.out.println("$100�� " + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		scanner.close();
	}
}
