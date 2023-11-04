package week4_1;
import java.util.Arrays;

public class Array {
	static void shuffle(int[] arr) {
		int n = (int)(Math.random()*10);
		int temp = arr[0];
		arr[0] = arr[n];
		arr[n] = temp;
	}
	
	public static void main(String[] args) {
		System.out.println("week3_1");
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		for(int i = 0; i < numArr.length;i++) {
			shuffle(numArr);
		}
		System.out.println(Arrays.toString(numArr));
	}
}
