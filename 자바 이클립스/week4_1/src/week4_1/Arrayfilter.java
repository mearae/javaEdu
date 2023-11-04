package week4_1;

import java.util.Arrays;

public class Arrayfilter {
	private static int[][] arraySignFilter(int[] src) {
		int pos = 0;
		int neg = 0;
		for(int i = 0; i < src.length; i++) {
			if(src[i]>0) {pos++;}
			else if(src[i]<0) {neg++;}
			else {continue;}
		}
		int arr[][] = new int[2][];
		arr[0] = new int[pos];
		arr[1] = new int[neg];
		int i = 0;
		int j = 0;
		for(int e : src) {
			if(e > 0) {
				arr[0][i] = e;
				i++;
			}
			else if(e < 0) {
				arr[1][j] = e;
				j++;
			}
			else {continue;}
		}
		return arr;
	}
	
	private static void printArray(String title, int[] arr) {
		System.out.print(title + " : ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] inputArray = { 1, -3, -100, 0, 75, 39, 999, -23 };
		int[][] filteredArray = arraySignFilter(inputArray);
		printArray("입력 받은 정수", inputArray);
		printArray("양의 정수", filteredArray[0]);
		printArray("음의 정수", filteredArray[1]);
	}
}
