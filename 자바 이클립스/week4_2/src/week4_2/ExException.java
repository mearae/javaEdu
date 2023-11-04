package week4_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExException {
	static int divide(int a, int b) {
		int tmp = a / b;
		return tmp;
	}

	public static void main(String[] args) {
		int dividend = 0;
		int divisor = 0;
		int result = 0;
		System.out.println("�������� �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		
		try {
			dividend = scanner.nextInt();
			divisor = scanner.nextInt();
			result = divide(dividend, divisor);
			System.out.println("try");

		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("������ �Է��� �� �ֽ��ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
		scanner.close();
		System.out.println(result);
		
	}
}
