package week3_Subject;

import java.util.Arrays;
import java.util.Scanner;
public class PrimeNumber1 {
	// is_prime[i] will be true if i is prime, false otherwise
	public static boolean[] is_prime;
	
	public static void check_prime(int k) {
		int i;
		for(i = 2; i*i <= k; i++) {
			if(is_prime[i]==true) {
				if(k % i == 0) {
					is_prime[k] = false;
					return;
				}
			}
		}
		return;
	}
	
	public static void printPrimeNumber() {
		int count=0;
		for(int i = 2; i < is_prime.length; i++) {
			if(is_prime[i] == true) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		System.out.print("Nums of Prime:" + count);
	}
	
	public static void legendre(int k) {
		double a = k / (Math.log(k) / Math.log(Math.E) - 1);
		System.out.print(", Legendre:" + Math.round(a));
	}
	
	public static void twinPrimeNumber() {
		int count=0;
		for(int i = 2; i < is_prime.length; i++) {
			if((is_prime[i] == true) && (is_prime[i + 2] == true)) {
				count++;
				//System.out.println(i + " is a prime");
			}
		}
		System.out.print(", Nums of Twin Prime:" + count);
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("학번: 12211628 이름: 배준혁");
		while(true) {
			System.out.print("탐색 범위 선택(0입력시 종료): ");
			n=scanner.nextInt();
			is_prime = new boolean[n+1];
			Arrays.fill(is_prime, true);
			if(n < 2) {
				System.out.println("End");
				break;
			}
			long sx = System.currentTimeMillis();
			for(int i = 2; i <= n; i++ ) {
				check_prime(i);
			}
			long ex = System.currentTimeMillis();
			printPrimeNumber();
			legendre(n);
			twinPrimeNumber();
			System.out.println("(" + (ex - sx) + "ms)");
		}
		scanner.close();
		return;
	}
}
