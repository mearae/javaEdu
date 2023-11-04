package week10_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class tester {

	public static void vectorTest() {
		System.out.println("Vector=====");
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(1);
		for(int i = 0; i< v.capacity(); i++) {
			v.add(i);
		}
		v.add(0,99);
		System.out.println(v);
		System.out.println(v.capacity());
		
		for(int i= 0; i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
		
		v.set(0, 98);
		System.out.println(v);
		
		v.remove(0);
		System.out.println(v);
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(102);
		v2.add(103);
		v2.add(105);
		System.out.println(v2);
		
		v.addAll(0, v2);
		System.out.println(v);
	}
	public static void arrayListTest() {
		System.out.println("ArrayList Test===");
		//ArrayList<String> l = new ArrayList<String>();
		LinkedList<String> l = new LinkedList<String>();
		//l.ensureCapacity(0);
		l.add("b");
		l.add("p");
		l.add("p");
		l.add("l");
		l.add("e");
		l.add("!");
		System.out.println(l);
		
		System.out.println(l.size());
		
		for(int i =0; i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		
		l.set(0, "a");
		System.out.println(l);
		
		l.remove(5);
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}
	
	public static void HashSetTest() {
		System.out.println("HashSetTest===");
		Set<String> s = new HashSet<String>();
		s.add("A");
		s.add("P");
		s.add("P");
		s.add("L");
		s.add("E");
		
		//set 없음, 삭제 후 삽입
		s.remove("A");
		
		System.out.println(s);
		System.out.println(s.size());
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String e =it.next();
			System.out.print(e+" ");
		}
	}
	public static void LinkedHashSetTest() {
		System.out.println("LinkedHashSetTest===");
		Set<String> s = new LinkedHashSet<String>();
		s.add("A");
		s.add("P");
		s.add("P");
		s.add("L");
		s.add("E");
		System.out.println(s);
		System.out.println(s.size());
		
	}
	public static void TreeSetTest() {
		System.out.println("TreeSetTest===");
		Set<String> s = new TreeSet<String>();
		s.add("A");
		s.add("P");
		s.add("P");
		s.add("L");
		s.add("E");
		System.out.println(s);
		System.out.println(s.size());
		
	}
	public static void HashtableTest() {
		System.out.println("HashtableTest===");
		Map<String, String> s = new Hashtable<String, String>();
		s.put("A","A");
		s.put("P","P");
		s.put("P2","P");
		s.put("L","L");
		s.put("E","E");
		System.out.println(s);
		System.out.println(s.size());
		
	}
	public static void TreeMapTest() {
		System.out.println("TreeMapTest===");
		Map<String, String> s = new TreeMap<String, String>();
		s.put("A","A");
		s.put("P","P");
		s.put("P2","P");
		s.put("L","L");
		s.put("E","E");
		System.out.println(s);
		System.out.println(s.size());
		
	}
	public static void HashMapTest() {
		System.out.println("HashMapTest===");
		Map<String, String> s = new HashMap<String, String>();
		s.put("A","A");
		s.put("P","P");
		s.put("P2","P");
		s.put("L","L");
		s.put("E","E");
		System.out.println(s);
		System.out.println(s.size());
		
	}
	public static void LinkedHashMapTest() {
		System.out.println("LinkedHashMapTest===");
		Map<String, String> s = new LinkedHashMap<String, String>();
		s.put("A","A");
		s.put("P","P");
		s.put("P2","P");
		s.put("L","L");
		s.put("E","E");
		System.out.println(s);
		System.out.println(s.size());
		
	}

	public static void main(String[] args) {
		//vectorTest();
		//arrayListTest();
		//HashSetTest();
		//LinkedHashSetTest();
		HashtableTest();
		HashMapTest();
		LinkedHashMapTest();
		TreeMapTest();
	}

}
