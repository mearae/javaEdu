package week2_1;
import week2_2.Harshad;
public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;//(int) (Math.random()*1000) + 1;
		System.out.println("Harshad Number:");
		for (int i = 2;i <= n;i++) {
			if(Harshad.solution(i))
				System.out.println(" " + i);
		}
		System.out.println(" ");
	}
}
