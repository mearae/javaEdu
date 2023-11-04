package Calculate;
import java.lang.Math;
public class Armstrong_Number {
	public static boolean solution(int arg) {
		int n = arg;
		int sum = 0;
		while (n>0) {
			int r = n % 10;
			sum = sum + (int) Math.pow(r, 3);
			n = n / 10;
		}
		if (arg == sum) {
			return true;
		}
		return false;

	}
}
