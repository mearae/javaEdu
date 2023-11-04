package week11_2;

class MyThread extends Thread{
	public void run() {
		System.out.println(getName());
		for(int i = 0; i < 10; i++) {
			System.out.println(""+i);
			try { sleep(10);} 
			catch (InterruptedException e) {}
		}
	}
}

public class ThreadEx {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		MyThread thread1 = new MyThread();
		while(true) {
			Thread.State state = thread1.getState();
			System.out.println(state);
			if(state == Thread.State.NEW)
				thread1.start();
			if(state == Thread.State.TERMINATED)
				break;
			Thread.sleep(5);
		}
	}
}