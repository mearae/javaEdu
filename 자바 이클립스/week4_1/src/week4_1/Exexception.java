package week4_1;
import java.util.Scanner;

public class Exexception {
	public static void main(String[] args) {
		int dividend = 0;
		int divisor = 0;
		int result = 0;
		System.out.println("�� ������ �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		dividend = scanner.nextInt();
		divisor = scanner.nextInt();
//		try {
			result = dividend / divisor;
			System.out.println(dividend + "/"+divisor+" result:"+result);
//		} catch (ArithmeticException e) {
//			System.out.println("Catch: 0���� ������ �����ϴ�."+e.getMessage());
//		} finally {
//			System.out.println("Finally:");
//		}
			scanner.close();
		System.out.println("Normally finished");
		}
}
