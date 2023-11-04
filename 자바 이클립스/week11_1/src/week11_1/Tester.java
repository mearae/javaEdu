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
		d.put("map", "����");
		d.put("school","�б�");
		d.put("java", "�ڹ�");
		Scanner scanner =new Scanner(System.in);
		do {
			System.out.print("���� �ܾ �Է��Ͻÿ�:");
			String name = scanner.next();
			if(name.equals("exit"))break;
			System.out.println("�ܾ��� �ǹ̴� "+d.get(name));
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
