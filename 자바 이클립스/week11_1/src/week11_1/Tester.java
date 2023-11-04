package week11_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Tester {
	
	public static void HashMapTest() {
		HashMap<String,String> m=new HashMap<>();
		m.put("A","A");
		m.put("P","P");
		m.put("P","P");
		m.put("L","L");
		m.put("E","E");
		System.out.println(m);
	}
	
	public static void LinkedHashMapTest() {
		LinkedHashMap<String,String> m=new LinkedHashMap<>();
		m.put("A","A");
		m.put("P","P");
		m.put("P","P");
		m.put("L","L");
		m.put("E","E");
		System.out.println(m);

	}
	
	public static void TreeMapTest() {
		TreeMap<String,String> m=new TreeMap<>();
		m.put("A","A");
		m.put("P","P");
		m.put("P","P");
		m.put("L","L");
		m.put("E","E");
		System.out.println(m);

	}
	
	public static void HashTableTest() {
		
	}
	
	public static void Dictionary() {
		HashMap<String,String> d=new HashMap<>();
		d.put("map", "지도");
		d.put("school","학교");
		d.put("java", "자바");
		Scanner scanner =new Scanner(System.in);
		do {
			System.out.print("영어 단어를 입력하시오:");
			String name = scanner.next();
			if(name.equals("exit"))break;
			System.out.println("단어의 의미는 "+d.get(name));
		} while(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapTest();
		LinkedHashMapTest();
		TreeMapTest();
		Dictionary();
	}

}
