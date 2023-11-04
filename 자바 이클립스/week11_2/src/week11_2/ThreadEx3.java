package week11_2;

class Counter2 {
	public int value = 0;
	public synchronized void increment() {
		while(value==100) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		value++;
		notify();
	};
	
	public synchronized void decrement() {
		while(value == 0) {
			try { wait();} 
			catch (InterruptedException e) {}
		}
		value--;
		notify();
	};
	public void printCounter() { 
		System.out.println(value); 
	}
}

class IncrementThread2 extends Thread{
	Counter2 sharedCounter;
	public IncrementThread2(Counter2 c) {
		this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.increment();
			if(i%10000 == 0) sharedCounter.printCounter();
		}	
	}
}

class DecrementThread2 extends Thread{
	Counter2 sharedCounter;
	public DecrementThread2(Counter2 c) {
		this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.decrement();
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) throws InterruptedException {
		Counter2 counter = new Counter2();
		IncrementThread2 thread1 = new IncrementThread2(counter);
		thread1.start();
		DecrementThread2 thread2 = new DecrementThread2(counter);
		thread2.start();
		thread1.join();
		thread2.join();
		counter.printCounter();
	}
}
