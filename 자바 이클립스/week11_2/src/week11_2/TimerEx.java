package week11_2;

import javax.swing.*;

class TimerThread extends Thread{
	public void run() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setTitle("My Timer");
		frame.add(label);
		frame.setSize(300, 100);
		frame.setVisible(true);
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			label.setText(""+i);
		}
		frame.setVisible(false);
	}
}


public class TimerEx {
	public static void main(String[] args) {
		TimerThread thread = new TimerThread();
		thread.start();
	}
}
