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
		System.out.println("두정수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		
		try {
			dividend = scanner.nextInt();
			divisor = scanner.nextInt();
			result = divide(dividend, divisor);
			System.out.println("try");

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다.");
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
