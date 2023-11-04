package week10_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>");
			String s=scanner.next();
			a.add(s);
		}
		
		for(int i =0;i<a.size();i++) {
			String name =a.get(i);
			System.out.print(name+" ");
		}
		
		int longIndex=0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longIndex).length()<a.get(i).length()) {
				longIndex=i;
			}
		}
		System.out.println("\n가장 긴 이름은: " + a.get(longIndex));
		scanner.close();
	}
	

}
