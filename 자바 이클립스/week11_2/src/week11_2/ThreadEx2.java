package week11_2;

class Counter {
	public int value = 0;
	public void increment() {
		value++;
	};
	public void decrement() {
		value--;
	};
	public void printCounter() {
		System.out.println(value);
	}
}

class IncrementThread extends Thread{
	Counter sharedCounter;
	public IncrementThread(Counter c) {
		this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.increment();
		}
	}
}

class DecrementThread extends Thread{
	Counter sharedCounter;
	public DecrementThread(Counter c) {
		this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.decrement();
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		IncrementThread thread1 = new IncrementThread(counter);
		thread1.start();
		DecrementThread thread2 = new DecrementThread(counter);
		thread2.start();
		thread1.join();
		thread2.join();
		counter.printCounter();
	}
}