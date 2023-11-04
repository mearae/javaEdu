package week11_1;

class MyTread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("+");
		}
	}
}

class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("-");
		}
	}
}

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Mian Thread");
		MyTread thread1=new MyTread();
		thread1.start();
		
		Thread thread2 = new Thread(new MyRunnable());
		thread2.start();
		
		thread1.join();
		thread2.join();
		System.out.println("Main R");
	}

}