package week9_1;

class Rect{
	int width;
	int height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Rect))
			return false;
		Rect a=(Rect)obj;
		if(a.width*a.height==width*height) {
			return true;
		}
		return false;
	}
}

public class EqualEx {
	public static void main(String[] args) {
		Rect a= new Rect(2,3);
		Rect b=new Rect(3,2);
		Rect c=new Rect(3,4);
		if(a.equals(b))
			System.out.println("a==b");
		if(a.equals(c))
			System.out.println("a==c");
		if(b.equals(c))
			System.out.println("b==c");
	}
}
