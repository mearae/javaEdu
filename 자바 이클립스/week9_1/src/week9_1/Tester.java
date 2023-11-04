package week9_1;
class Point{
	int x, y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Hello";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point p =(Point)obj;
		if(x==p.x&&y==p.y)return true;
		else return false;
		
	}

}
public class Tester {
	public static void main(String[] args) {
		System.out.println("=======hash=====");
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,3);
		Point p3=p1;
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(System.identityHashCode(p1));
		
		System.out.println("======getClass======");
		Point p4 = new Point(3,4);
		//Class cls = p4.getClass();
		System.out.println(p4.getClass().getName());
		System.out.println(p4.getClass().getSimpleName());
		System.out.println(p4.getClass().getPackageName());
		
		Point p =new Point(3,4);
		System.out.println(p);
		System.out.println(p.toString());
		
		Point a=new Point(2,3);
		Point b =new Point(2,3);
		
		if(a.equals(b)) {
			System.out.println("a==b");
		}
		else {
			System.out.println("a!=b");
		}
	}

}
