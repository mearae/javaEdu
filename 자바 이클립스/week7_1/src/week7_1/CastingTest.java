package week7_1;

class Person{
	String strName;
	
	public Person(String strName) {
		super();
		this.strName = strName;
	}
}

class Student extends Person{
	String grade;
	
	public Student(String strName, String grade) {
		super(strName);
		this.grade = grade;
	}
}

public class CastingTest {
	static void printInfo(Person p) {
		System.out.println(p.strName);
		
		if( p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.grade);
		}
	}
	public static void main(String[] args) {
		Student o1 = new Student("Hong", "A");
		Person o2 = new Person("Park");
		Person o3 = new Student("Kim", "A");
		//Student o4 = (Student) new Person("Jung");
		
		printInfo(o1);
		printInfo(o2);
		printInfo(o3);
	}
}
