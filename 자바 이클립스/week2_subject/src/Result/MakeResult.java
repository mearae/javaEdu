package Result;
import Calculate.Harshad;
import Calculate.Armstrong_Number;
import Calculate.Perfect_Number;
public class MakeResult {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		System.out.println("학번:12211628 이름:배준혁");
		System.out.println("Harshad Number:");
		for (int i = 2;i <= n;i++) {
			if(Harshad.solution(i))
				System.out.print(" " + i);
		}
		System.out.println(" ");
		System.out.println("Armstrong Number:");
		for (int i = 2;i <= n;i++) {
			if(Armstrong_Number.solution(i))
				System.out.print(" " + i);
		}
		System.out.println(" ");
		System.out.println("Perfect Number:");
		for (int i = 2;i <= n;i++) {
			if(Perfect_Number.solution(i))
				System.out.print(" " + i);
		}
		System.out.println(" ");
	}
}
