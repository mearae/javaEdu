package Calculate;
public class Perfect_Number {
	public static boolean solution(int arg) {
		int sum = 0;
		for(int i = 1; i < arg; i++) {
			if(arg % i == 0) {
				sum = sum + i;
			}
		}
		if (arg == sum) {
			return true;
		}
		return false;

	}
}